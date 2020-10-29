package com.hdesamsetti.springbootlucenesearch.controller;

import com.hdesamsetti.springbootlucenesearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/count")
    public int getTotalEmployeeCount(){
        return employeeService.getTotalEmployeeCount();
    }
}
