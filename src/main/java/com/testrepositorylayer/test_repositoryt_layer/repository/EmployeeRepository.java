package com.testrepositorylayer.test_repositoryt_layer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testrepositorylayer.test_repositoryt_layer.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
