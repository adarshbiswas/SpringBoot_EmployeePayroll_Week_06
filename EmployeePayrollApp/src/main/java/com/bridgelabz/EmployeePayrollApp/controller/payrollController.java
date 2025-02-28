package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.entities.User;
import com.bridgelabz.EmployeePayrollApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class payrollController {

    @Autowired
    private UserService userService;

    //    Get all users
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    //    Get users by ID
    @GetMapping("/{id}")
    public User getUserById(@RequestParam Long id) {
        return userService.getUserById(id);
    }

    //    Create a User
    @PostMapping("/new-user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //    Delete a user by ID
    @DeleteMapping("/{id}")
    public String deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
        return "User deleted successfully!!!";
    }
}
