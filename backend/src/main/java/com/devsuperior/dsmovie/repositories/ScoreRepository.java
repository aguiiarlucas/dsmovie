package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePk;
import com.devsuperior.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
 
}
