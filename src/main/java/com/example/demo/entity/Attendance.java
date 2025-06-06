package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.demo.enums.DayType;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attendances")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;

    private LocalDate date;
    private LocalTime inTime;
    private LocalTime outTime;
    private boolean present;

    @Enumerated(EnumType.STRING)
    private DayType dayType;
}
