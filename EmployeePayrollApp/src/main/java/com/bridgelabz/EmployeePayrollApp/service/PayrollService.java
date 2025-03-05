package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.model.Employee;
import com.bridgelabz.EmployeePayrollApp.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PayrollService {

    @Autowired
    private EmployeeRepository employeeRepository;


    //    Get all the employee
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    //    Find employee by name
    public Employee findEmployee(String name) {
        return employeeRepository.findByName(name);
    }

    //    Save employee data
    public String saveEmployee(Employee emp) {
        employeeRepository.save(emp);
        log.info("Employee created with details: {}", emp);
        return "Employee detail saved successfully!";
    }

    //    Delete a data
    public void deleteEmployeeData(String name) {
        employeeRepository.deleteByName(name);
        log.warn("Deleting Employee with name: {}", name);
    }
}
