package com.pbcool.football101.models;

public class LeagueDataRequest {

    private Integer teamId;
    private Integer leagueId;

    // Add Getters & Setters
    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }
}
