package com.pbcool.football101.controller;


import com.pbcool.football101.models.MatchDataRequest;
import com.pbcool.football101.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("match")
public class MatchController {

    @Autowired
    MatchService matchService;

    @PostMapping("add")
    public ResponseEntity<String> updateMatchHistoryAndLeaderBoard(@RequestBody MatchDataRequest match){
        return matchService.updateMatchHistoryAndLeaderBoard(match);
    }

}
