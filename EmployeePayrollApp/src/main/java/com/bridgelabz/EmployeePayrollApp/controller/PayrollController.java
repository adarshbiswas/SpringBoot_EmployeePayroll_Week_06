package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.model.Employee;
import com.bridgelabz.EmployeePayrollApp.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @GetMapping
    public List<Employee> getAllEmployee() {
        return payrollService.getAllEmployee();
    }

    @GetMapping("/find/{name}")
    public Employee findEmployee(@PathVariable String name) {
        return payrollService.findEmployee(name);
    }

    @PostMapping("/new-employee")
    public String newEmployee(@RequestBody Employee emp) {
        return payrollService.saveEmployee(emp);
    }

    @DeleteMapping("/delete/{name}")
    public String deleteEmployee(@PathVariable String name) {
        payrollService.deleteEmployee(name);
        return "Data deleted successfully!";
    }
}
