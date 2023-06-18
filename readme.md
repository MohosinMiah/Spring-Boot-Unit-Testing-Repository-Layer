## Spring-Boot---Unit-Testing-Repository-Layer

### Test Case Structure

When writing test cases, we follow the <b>given-when-then </b> structure to provide clear and concise test descriptions. Here's an example:

```java
@Test
public void given_when_then() {
    // Given: Setup object or precondition
    
    // When: Action or behavior that we are going to test
    
    // Then: Verify the output or expected result
}
```

## Annotaion details

# @DataJpaTest
The @DataJpaTest annotation in Spring Boot is used for integration testing of JPA repositories. It provides a convenient way to test the persistence layer of your application by automatically configuring an in-memory database, creating a TestEntityManager, and setting up a transactional test environment.
It will only load Repository layer.

# @BeforeEach
The @BeforeEach annotation in JUnit 5 is used to signal that a method should be executed before each test method in a test class. It allows you to set up the necessary preconditions or perform any common initialization steps before running each individual test.

## Code Summary 
# Employee Repository Unit Testing

This repository contains unit tests for the EmployeeRepository interface in a Spring Boot application. The EmployeeRepository interface extends the JpaRepository interface, providing CRUD operations for the Employee entity. Additionally, it defines custom query methods using JPQL and native SQL queries.

## Test Environment

The EmployeeRepositoryTests class is annotated with `@DataJpaTest`, which indicates that it is a JPA repository test and will be executed within a Spring context. This allows the tests to interact with the underlying database.

## Test Setup

The setupTestData method is annotated with `@BeforeEach` and is executed before each test method. It sets up the test data by creating an Employee object with sample values.

## Test Cases

The test methods in the EmployeeRepositoryTests class cover various scenarios to test the repository operations. Each test method follows the Given-When-Then pattern to structure the test cases.

1. **givenEmployeeObject_whenSave_thenReturnSaveEmployee**: This test case verifies the save operation by saving an Employee object and asserting that it is not null and has a valid ID.

2. **givenEmployeeList_whenFindAll_thenEmployeeList**: This test case tests the find all operation by saving multiple Employee objects and asserting that the list of employees is not empty and has the expected size.

3. **givenEmployeeObject_whenFindById_thenReturnEmployeeObject**: This test case tests the find by ID operation by saving an Employee object and then retrieving it using the findById method. It asserts that the retrieved employee is not null.

4. **givenEmployeeEmail_whenFindByEmail_thenEmployeeObject**: This test case tests the find by email operation by saving an Employee object and then retrieving it using the findByEmail method. It asserts that the retrieved employee is not null and has the expected email.

5. **givenEmployeeObject_whenUpdate_thenEmployeeObject**: This test case tests the update operation by saving an Employee object, updating its properties, and asserting that the updated employee has the expected values.

6. **givenEmployeeObject_whenDelete_thenRemoveEmployee**: This test case tests the delete operation by saving an Employee object, deleting it by ID, and asserting that the deleted employee is not present in the repository.

Additional test methods demonstrate the usage of custom queries using JPQL and native SQL.

## Assertions

Each test method uses assertions from the assertj-core library to verify the output or expected result. The assertions ensure that the expected conditions are met during the test execution.

## Running the Tests

To run the tests, execute the test class using your preferred testing framework or IDE. The tests will be executed in a Spring context, allowing interaction with the database through the EmployeeRepository interface.

Note: Make sure to configure the test environment appropriately, including the database connection and any necessary dependencies.

## Conclusion

The Employee Repository Unit Testing project provides comprehensive unit tests for the EmployeeRepository interface in a Spring Boot application. These tests validate the CRUD operations and custom query methods, ensuring the correct behavior of the repository layer.