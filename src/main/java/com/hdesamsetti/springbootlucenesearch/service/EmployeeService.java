package com.hdesamsetti.springbootlucenesearch.service;

import com.hdesamsetti.springbootlucenesearch.DAO.EmployeeDAO;
import com.hdesamsetti.springbootlucenesearch.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public int getTotalEmployeeCount(){
        return (int) employeeDAO.count();
    }

    public Optional<Employee> findEmployeeById(long id) {
        return employeeDAO.findById(id);
    }
}
