package com.testrepositorylayer.test_repositoryt_layer.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.testrepositorylayer.test_repositoryt_layer.entity.Employee;

@DataJpaTest
public class EmployeeRepositoryTests {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    // JUnit Test for save employee operation
    @Test
    @DisplayName("JUnit test for save employee operation")
    public void givenEmployeeObject_whenSave_thenReturnSaveEmployee(){

        // Given : Setup object or precondition
        Employee employee = Employee.builder()
                .firstName("MOHOSIN")
                .lastName("MIAH")
                .email("mohosinmiah1610@gmail.com")
                .departmentCode("CSE")
                .build();

        // When : Action of behavious that we are going to test
        Employee saveEmployee = employeeRepository.save(employee);

        // Then : Verify the output
        // Assertions.assertThat(saveEmployee).isNotNull();
        // Assertions.assertThat(saveEmployee.getId()).isGreaterThan(0);

        // Statically import call method . Like import static org.assertj.core.api.Assertions.assertThat; Sp that we can use method directly

        assertThat(saveEmployee).isNotNull();
        assertThat(saveEmployee.getId()).isGreaterThan(0);

    }

    // JUnit test for get Employee List
    @Test
    @DisplayName("JUnit test for get Employee List")
    public void givenEmployeeList_whenFindAll_thenEmployeeList(){

        // Given : Setup object or precondition
        Employee employeeOne = Employee.builder()
                .firstName("MOHOSIN One")
                .lastName("MIAH One")
                .email("mohosinmiah1610@gmail.com")
                .departmentCode("CSE")
                .build();

        Employee employeeTwo = Employee.builder()
                .firstName("MOHOSIN Two")
                .lastName("MIAH Two")
                .email("mohosinmiah1610@gmail.com")
                .departmentCode("CSE")
                .build();

        employeeRepository.save(employeeOne);
        employeeRepository.save(employeeTwo);

        // When : Action of behavious that we are going to test
        List<Employee> employees = employeeRepository.findAll();

        // Then : Verify the output
        assertThat(employees).isNotEmpty();
        assertThat(employees.size()).isEqualTo(2);
    }

    // JUnit test for get Employee By Id
    
    @Test
    @DisplayName("JUnit test for get Employee By Id")
    public void givenEmployeeObject_whenFindById_thenReturnEmployeeObject()
    {
        // Given : Setup object or precondition
        Employee employee = Employee.builder()
                .firstName("MOHOSIN One")
                .lastName("MIAH One")
                .email("mohosinmiah1610@gmail.com")
                .departmentCode("CSE")
                .build();
        employeeRepository.save(employee);


        // When : Action of behavious that we are going to test
        Employee getEmployee = employeeRepository.findById(1L).get();

        // Then : Verify the output
        assertThat(getEmployee).isNotNull();
        assertThat(getEmployee.getFirstName()).isEqualTo("MOHOSIN One");
    }

}


@Test
public void given_when_then() {
    // Given: Setup object or precondition
    
    // When: Action or behavior that we are going to test
    
    // Then: Verify the output or expected result
}


## Annotaion details

# @DataJpaTest
The @DataJpaTest annotation in Spring Boot is used for integration testing of JPA repositories. It provides a convenient way to test the persistence layer of your application by automatically configuring an in-memory database, creating a TestEntityManager, and setting up a transactional test environment.
It will only load Repository layer.



