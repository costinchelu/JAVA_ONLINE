package com.chaddarby.thymeleaf.service;

import com.chaddarby.thymeleaf.dao.EmployeeRepository;
import com.chaddarby.thymeleaf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;


    // constructor injection
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int employeeId) {
        Optional<Employee> result = employeeRepository.findById(employeeId);

        Employee returnedEmployee = null;
        if (result.isPresent()) {
            returnedEmployee = result.get();
        } else {
            throw new RuntimeException("Can't find employee with id " + employeeId);
        }

        return returnedEmployee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    // we don't need @Transactional since Spring Data JPA takes care of that
}
