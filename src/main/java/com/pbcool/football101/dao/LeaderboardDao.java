package com.pbcool.football101.dao;

import com.pbcool.football101.models.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface LeaderboardDao extends JpaRepository<Leaderboard, Integer> {

    boolean existsByTeamId(Integer teamId);

    List<Leaderboard> findByLeague_LeagueNameOrderByPointsDesc(String leagueName);

//    List<Leaderboard> findByLeague_LeagueName(String leagueName);
}
