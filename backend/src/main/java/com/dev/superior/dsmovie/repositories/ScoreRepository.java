package com.dev.superior.dsmovie.repositories;

import com.dev.superior.dsmovie.entities.Score;
import com.dev.superior.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends  JpaRepository<Score, ScorePK> {
    
}
