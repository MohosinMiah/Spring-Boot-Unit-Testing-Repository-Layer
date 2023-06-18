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

    // JUnit test for get Employee List operation
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

    // JUnit test for get Employee By Id operation
    
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


    // JUnit test for get employee by email operation
    @Test
    @DisplayName("JUnit test for get employee by email operation")
    public void givenEmployeeEmail_whenFindByEmail_thenEmployeeObject() {

        // Given: Setup object or precondition
        Employee employee = Employee.builder()
                .firstName("MOHOSIN One")
                .lastName("MIAH One")
                .email("mohosinmiah1610@gmail.com")
                .departmentCode("CSE")
                .build();
        employeeRepository.save(employee);

        // When: Action or behavior that we are going to test
        Employee getEmployee = employeeRepository.findByEmail("mohosinmiah1610@gmail.com").get();

        // Then: Verify the output or expected result
        assertThat(getEmployee).isNotNull();
        assertThat(getEmployee.getEmail()).isEqualTo("mohosinmiah1610@gmail.com");
    }


}



