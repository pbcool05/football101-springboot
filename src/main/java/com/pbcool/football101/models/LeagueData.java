//package com.pbcool.football101.models;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//
////@Getter
////@Setter
//@Data
//@Entity
//public class LeagueData {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @OneToOne
//    @JoinColumn(name = "team_id", unique = true)
//    private Team team;
//
//    @ManyToOne
//    @JoinColumn(name = "league_id")
//    private League league;
//
//    private int won;
//    private int lost;
//    private int drawn;
//
//    @Column(name = "matches_played")
//    private int matchesPlayed;
//    private int points;
//
//
////    public void setTeam(Team team) {
////        this.team = team;
////    }
////
////    public void setLeague(League league) {
////        this.league = league;
////    }
////
////    public void setWon(int won) {
////        this.won = won;
////    }
////
////    public void setLost(int lost) {
////        this.lost = lost;
////    }
////
////    public void setDrawn(int drawn) {
////        this.drawn = drawn;
////    }
////
////    public void setMatchesPlayed(int matchesPlayed) {
////        this.matchesPlayed = matchesPlayed;
////    }
////
////    public void setPoints(int points) {
////        this.points = points;
////    }
//}
