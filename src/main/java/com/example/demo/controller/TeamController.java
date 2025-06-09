package com.example.demo.controller;

import com.example.demo.Dto.TeamMemberSummaryDTO;
import com.example.demo.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/manager/{managerId}")
    public List<TeamMemberSummaryDTO> getTeamSummary(@PathVariable Long managerId) {
        return teamService.getTeamMembersByManagerId(managerId);  // ✅ Correct method call
    }

}
