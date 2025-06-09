package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String role;

    // New fields for dashboard and team logic
    private String status; // e.g. Active, Onboarding, On Leave
    private Double weeklyLoggedHours;
    private String currentJob;

    private Long managerId; // Maps to another Employee's ID

    // Constructors
    public Employee() {}

    public Employee(Long id, String name, String email, String role,
                    String status, Double weeklyLoggedHours,
                    String currentJob, Long managerId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.status = status;
        this.weeklyLoggedHours = weeklyLoggedHours;
        this.currentJob = currentJob;
        this.managerId = managerId;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Double getWeeklyLoggedHours() { return weeklyLoggedHours; }
    public void setWeeklyLoggedHours(Double weeklyLoggedHours) { this.weeklyLoggedHours = weeklyLoggedHours; }

    public String getCurrentJob() { return currentJob; }
    public void setCurrentJob(String currentJob) { this.currentJob = currentJob; }

    public Long getManagerId() { return managerId; }
    public void setManagerId(Long managerId) { this.managerId = managerId; }

    // Optional Builder
    public static class Builder {
        private Long id;
        private String name;
        private String email;
        private String role;
        private String status;
        private Double weeklyLoggedHours;
        private String currentJob;
        private Long managerId;

        public Builder id(Long id) { this.id = id; return this; }
        public Builder name(String name) { this.name = name; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder role(String role) { this.role = role; return this; }
        public Builder status(String status) { this.status = status; return this; }
        public Builder weeklyLoggedHours(Double hours) { this.weeklyLoggedHours = hours; return this; }
        public Builder currentJob(String job) { this.currentJob = job; return this; }
        public Builder managerId(Long managerId) { this.managerId = managerId; return this; }

        public Employee build() {
            return new Employee(id, name, email, role, status, weeklyLoggedHours, currentJob, managerId);
        }
    }
}
