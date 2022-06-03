package com.hexaware.RESTAPIAssesment.Controller;

import com.hexaware.RESTAPIAssesment.Entity.Employee;
import com.hexaware.RESTAPIAssesment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService person;

    @GetMapping("/")
    public ResponseEntity<Object> TestAssesment(@Valid @RequestBody Employee person){
        Employee newEmp = this.person.addEmployee(person);
        Map<String, Object> statusMsg = new HashMap<>();
        List<String> errors = new ArrayList<>();

        if(newEmp.getEmployeeId() == 0) {
            statusMsg.put("Status", "ERROR");
            errors.add("Error creating user");
        }
        else statusMsg.put("Status", "VALID");
        statusMsg.put("errors", errors);
        return new ResponseEntity<>(statusMsg, HttpStatus.CREATED);
    }


}
