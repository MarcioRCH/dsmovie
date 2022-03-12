package com.marcio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
