package com.example.demo3.controller;

import com.example.demo3.entities.Employee;
import com.example.demo3.repository.EmployeeRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="EmployeeController")
public class EmployeeController {
    @Autowired(required = true)
    private EmployeeRepository repository;

    @PostMapping(path="/SaveEmployee")
    public String saveEmployee(@RequestBody Employee emp)
    {
        repository.save(emp);
        return "Employee of the year : Prof. Anirudh Potdar";
    }
    @GetMapping(path="/GetallEmployees")
    public List<Employee> getall()
    {
        return repository.findAll();
    }

    @GetMapping(path="GetallEmployees/{dept}")
    public List<Employee> getEmployee(@PathVariable String dept)
    {
        return repository.findBydept(dept);
    }
}
