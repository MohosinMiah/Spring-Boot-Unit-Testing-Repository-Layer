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

