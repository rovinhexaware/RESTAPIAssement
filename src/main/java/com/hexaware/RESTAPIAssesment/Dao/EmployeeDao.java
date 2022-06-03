package com.hexaware.RESTAPIAssesment.Dao;

import com.hexaware.RESTAPIAssesment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
