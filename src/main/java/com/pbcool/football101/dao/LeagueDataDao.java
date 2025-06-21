package com.pbcool.football101.dao;


import com.pbcool.football101.models.LeagueData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueDataDao extends JpaRepository<LeagueData, Integer> {
    boolean existsByTeamId(Integer teamId);
}
