package com.cognizant.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.movie.dao.MovieDaoImpl;
import com.cognizant.movie.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDaoImpl movieDaoImpl;

	@Override
	public List<Movie> getMovieListAdmin() {

		return movieDaoImpl.getMovieListAdmin();
	}

	@Override
	public List<Movie> getMovieListCustomer() {

		return movieDaoImpl.getMovieListCustomer();
	}

	@Override
	public void modifyMovie(int movieId, Movie movie) {
		movieDaoImpl.modifyMovie(movieId, movie);

	}

	@Override
	public Movie getMovie(int movieId) {
		
		return movieDaoImpl.getMovie(movieId);
	}

	@Override
	public void addMovie(Movie movie) {
		
		movieDaoImpl.addMovie(movie);

	}

	@Override
	public void removeMovie(int movieId) {
		movieDaoImpl.removeMovie(movieId);

	}

}
