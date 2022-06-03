package com.hexaware.RESTAPIAssesment.Service;

import com.hexaware.RESTAPIAssesment.Dao.EmployeeDao;
import com.hexaware.RESTAPIAssesment.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImplementation implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

}
