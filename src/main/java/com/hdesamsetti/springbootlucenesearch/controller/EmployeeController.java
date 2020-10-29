package com.hdesamsetti.springbootlucenesearch.controller;

import com.hdesamsetti.springbootlucenesearch.model.Employee;
import com.hdesamsetti.springbootlucenesearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/count")
    public int getTotalEmployeeCount(){
        return employeeService.getTotalEmployeeCount();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeId(@PathVariable(value = "id") int id){
        return employeeService.findEmployeeById(id);
    }
}
