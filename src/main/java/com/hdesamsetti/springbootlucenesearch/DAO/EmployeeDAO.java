package com.hdesamsetti.springbootlucenesearch.DAO;

import com.hdesamsetti.springbootlucenesearch.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
