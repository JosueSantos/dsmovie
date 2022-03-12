package com.dev.superior.dsmovie.repositories;

import com.dev.superior.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends  JpaRepository<Movie, Long> {
    
}
