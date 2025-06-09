package com.example.demo.Dto;

public class TeamMemberSummaryDTO {

    private Long employeeId;
    private String name;
    private String status;
    private String currentJob;
    private Double weeklyLoggedHours;
    private boolean onLeave;

    // No-arg constructor
    public TeamMemberSummaryDTO() {}

    // All-arg constructor
    public TeamMemberSummaryDTO(Long employeeId, String name, String status,
                                String currentJob, Double weeklyLoggedHours, boolean onLeave) {
        this.employeeId = employeeId;
        this.name = name;
        this.status = status;
        this.currentJob = currentJob;
        this.weeklyLoggedHours = weeklyLoggedHours;
        this.onLeave = onLeave;
    }

    // Getters and Setters
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    public Double getWeeklyLoggedHours() {
        return weeklyLoggedHours;
    }

    public void setWeeklyLoggedHours(Double weeklyLoggedHours) {
        this.weeklyLoggedHours = weeklyLoggedHours;
    }

    public boolean isOnLeave() {
        return onLeave;
    }

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "TeamMemberSummaryDTO{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", currentJob='" + currentJob + '\'' +
                ", weeklyLoggedHours=" + weeklyLoggedHours +
                ", onLeave=" + onLeave +
                '}';
    }
}
