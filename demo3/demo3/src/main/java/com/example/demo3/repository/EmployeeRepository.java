package com.example.demo3.repository;

import com.example.demo3.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

    List<Employee> findBydept(String dept);

}
