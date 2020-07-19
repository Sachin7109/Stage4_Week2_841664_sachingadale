package com.cognizant.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.movie.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
