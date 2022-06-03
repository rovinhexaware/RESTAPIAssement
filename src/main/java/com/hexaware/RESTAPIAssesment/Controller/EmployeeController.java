package com.hexaware.RESTAPIAssesment.Controller;

import com.hexaware.RESTAPIAssesment.Entity.Employee;
import com.hexaware.RESTAPIAssesment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService person;

    @GetMapping("/k")
    public ResponseEntity<Employee> TestAssesment(@Valid @RequestBody Employee person){
        Employee newEmp = this.person.addEmployee(person);
        return new ResponseEntity<>(newEmp, HttpStatus.CREATED);
    }

}
