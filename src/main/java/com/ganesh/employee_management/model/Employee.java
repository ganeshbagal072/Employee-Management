package com.ganesh.employee_management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // Primary key, auto-increment

    @Column(nullable = false)
    private String name;

    private String department;

    @Column(unique = true, nullable = false)
    private String email;

    private double salary;

    // Default constructor (required by JPA)
    public Employee() {}

    // Parameterized constructor (optional, for convenience)
    public Employee(String name, String department, String email, double salary) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}