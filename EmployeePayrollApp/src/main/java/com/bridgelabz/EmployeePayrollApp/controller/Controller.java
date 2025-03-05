package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Controller {


    //    Get all users
    @GetMapping
    public String sayHello() {
        return "Hello from bridgeLabz!";
    }

    @GetMapping("/{name}")
    public String getUserById(@RequestParam String name) {
        return "Hello " + name + " from bridgeLabz!";
    }

    //    Create a User
    @PostMapping("/new-user")
    public String createUser(@RequestBody User user) {
        return "Hello " + user.getName() + ", you're email is: " + user.getEmail();
    }

    //    Update a user
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return new User("User updated successfully!" + user.getName());
    }

    //    Delete a user
    @DeleteMapping("/delete")
    public String deleteUser() {
        return "User deleted successfully!!!";
    }
}
