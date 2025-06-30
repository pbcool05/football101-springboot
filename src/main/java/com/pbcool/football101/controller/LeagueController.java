package com.pbcool.football101.controller;


import com.pbcool.football101.models.League;
//import com.pbcool.football101.models.LeagueData;
//import com.pbcool.football101.models.LeagueDataRequest;
import com.pbcool.football101.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("league")
public class LeagueController {

    @Autowired
    LeagueService leagueService;

    @GetMapping("allLeagues")
    public ResponseEntity<List<League>> getAllLeagues(){
        return leagueService.getAllLeagues();
    }

//    @PostMapping("add")
//    public ResponseEntity<String> assignTeamToLeague(@RequestBody LeagueDataRequest request){
//
//        return  leagueService.assignTeamToLeague(request);
//    }


}
