package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "leave_import_logs")
public class LeaveImportLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private int totalRows;

    private int successCount;

    private int failureCount;

    @Lob
    private String errorDetails;

    private LocalDateTime importedAt;

    private String importedBy;

    // No-args constructor
    public LeaveImportLog() {}

    // All-args constructor
    public LeaveImportLog(Long id, String fileName, int totalRows, int successCount, int failureCount,
                          String errorDetails, LocalDateTime importedAt, String importedBy) {
        this.id = id;
        this.fileName = fileName;
        this.totalRows = totalRows;
        this.successCount = successCount;
        this.failureCount = failureCount;
        this.errorDetails = errorDetails;
        this.importedAt = importedAt;
        this.importedBy = importedBy;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getTotalRows() {
        return totalRows;
    }
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getSuccessCount() {
        return successCount;
    }
    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getFailureCount() {
        return failureCount;
    }
    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }

    public String getErrorDetails() {
        return errorDetails;
    }
    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public LocalDateTime getImportedAt() {
        return importedAt;
    }
    public void setImportedAt(LocalDateTime importedAt) {
        this.importedAt = importedAt;
    }

    public String getImportedBy() {
        return importedBy;
    }
    public void setImportedBy(String importedBy) {
        this.importedBy = importedBy;
    }

    // Optional: Manual Builder pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String fileName;
        private int totalRows;
        private int successCount;
        private int failureCount;
        private String errorDetails;
        private LocalDateTime importedAt;
        private String importedBy;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder totalRows(int totalRows) {
            this.totalRows = totalRows;
            return this;
        }
        public Builder successCount(int successCount) {
            this.successCount = successCount;
            return this;
        }
        public Builder failureCount(int failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Builder errorDetails(String errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public Builder importedAt(LocalDateTime importedAt) {
            this.importedAt = importedAt;
            return this;
        }
        public Builder importedBy(String importedBy) {
            this.importedBy = importedBy;
            return this;
        }
        public LeaveImportLog build() {
            return new LeaveImportLog(id, fileName, totalRows, successCount, failureCount, errorDetails, importedAt, importedBy);
        }
    }
}
