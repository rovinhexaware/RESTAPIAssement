package com.hexaware.RESTAPIAssesment.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @NotNull
    @NotEmpty
    @Size(min = 4, message = "Name should be at least 4 characters")
    private String name;

    @NotEmpty
    @Email(message = "Please enter a valid email")
    private String email;

    @Min(value = 1000, message = "Salary should be more than 1000")
    private int salary;

    public Employee() {
    }

    public Employee(int employeeId, String name, String email, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
