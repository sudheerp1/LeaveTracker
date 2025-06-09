package com.example.demo.service;

import com.example.demo.Dto.TeamMemberSummaryDTO;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface TeamService {
    List<TeamMemberSummaryDTO> getTeamMembersByManagerId(Long managerId);
}

@Service
class TeamServiceImpl implements TeamService {

    private final EmployeeRepository employeeRepository;

    public TeamServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<TeamMemberSummaryDTO> getTeamMembersByManagerId(Long managerId) {
        List<Employee> employees = employeeRepository.findByManagerId(managerId);
        List<TeamMemberSummaryDTO> result = new ArrayList<>();

        for (Employee emp : employees) {
            TeamMemberSummaryDTO dto = new TeamMemberSummaryDTO();
            dto.setEmployeeId(emp.getId());
            dto.setName(emp.getName());
            dto.setStatus("Active"); // You can update this logic to pull real status
            dto.setCurrentJob("Working on project X"); // Replace with actual job info
            dto.setWeeklyLoggedHours(0.0); // Replace with calculated hours if available
            dto.setOnLeave(false); // Replace with leave-check logic if needed

            result.add(dto);
        }

        return result;
    }
}
