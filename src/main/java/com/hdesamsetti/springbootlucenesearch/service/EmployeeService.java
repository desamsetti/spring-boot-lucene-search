package com.hdesamsetti.springbootlucenesearch.service;

import com.hdesamsetti.springbootlucenesearch.DAO.EmployeeDAO;
import com.hdesamsetti.springbootlucenesearch.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public int getTotalEmployeeCount(){
        return (int) employeeDAO.count();
    }
}
