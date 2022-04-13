package com.htraore.springbootdemo.repository;

import com.htraore.springbootdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author htraore
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
