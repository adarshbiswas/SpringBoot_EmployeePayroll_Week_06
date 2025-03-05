package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.model.Employee;
import com.bridgelabz.EmployeePayrollApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        return "Employee detail saved successfully!";
    }

    //    Delete a data
    public void deleteEmployee(String name) {
        employeeRepository.deleteByName(name);
    }
}
