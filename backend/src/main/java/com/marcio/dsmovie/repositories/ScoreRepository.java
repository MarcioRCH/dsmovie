package com.marcio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.dsmovie.entities.Score;
import com.marcio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
