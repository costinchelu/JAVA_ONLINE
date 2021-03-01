package com.chaddarby.spring.dao;

import com.chaddarby.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need to specify any methods (Spring will take care to generate implementations)
}
