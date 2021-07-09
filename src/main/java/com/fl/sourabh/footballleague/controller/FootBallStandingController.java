package com.fl.sourabh.footballleague.controller;

import com.fl.sourabh.footballleague.dto.TeamStandingDto;
import com.fl.sourabh.footballleague.model.TeamStandingRequest;
import com.fl.sourabh.footballleague.service.TeamStandingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController
{

  private final TeamStandingService teamStandingService;

  @Autowired
  public FootBallStandingController(
      TeamStandingService teamStandingService) {
    this.teamStandingService = teamStandingService;
  }

  @GetMapping

  public ResponseEntity<TeamStandingDto> getStandings(TeamStandingRequest teamStandingRequest) {
    log.info("Request {}", teamStandingRequest.toString());
    return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
  }


}
