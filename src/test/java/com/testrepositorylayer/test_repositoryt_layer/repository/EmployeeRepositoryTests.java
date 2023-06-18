package com.testrepositorylayer.test_repositoryt_layer.repository;

import org.assertj.core.api.Assertions;
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
        Assertions.assertThat(saveEmployee).isNotNull();
        Assertions.assertThat(saveEmployee.getId()).isGreaterThan(0);
    }

}
