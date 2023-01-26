package com.example.Employee.Information.system.controller;


import com.example.Employee.Information.system.model.Employee;

import com.example.Employee.Information.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;



import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    private final EmployeeService employeeService;

    //private org.springframework.http.ResponseEntity<Void> ResponseEntity;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }




    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }


    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getByFirstName/search/{firstName}")
    public  Employee getByName(@PathVariable String firstName) {
        return  employeeService.getByFirstName(firstName);
    }







}