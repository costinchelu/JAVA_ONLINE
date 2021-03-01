package com.chaddarby.thymeleaf.dao;

import com.chaddarby.thymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // method to sort by lastName
    public List<Employee> findAllByOrderByLastNameAsc();
}
