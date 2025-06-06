package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

import org.springframework.security.core.userdetails.User;

import com.example.demo.Dto.LeaveApplicationDTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String leaveType;

    private LocalDate fromDate;

    private LocalDate toDate;

    private String reason;

    private String status; // PENDING, APPROVED, REJECTED

    private int hoursTaken;

    private LocalDate requestDate;

    private String operation; // Add/Update/Delete

    private String teamEmailId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


	public LeaveApplicationDTO getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

  
}
