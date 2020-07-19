package com.cognizant.favourites.service;

import java.util.ArrayList;

import com.cognizant.favourites.exception.MovieNotFoundException;
import com.cognizant.favourites.model.Movie;

public interface FavoriteService {

	// to add Movie in given user Favorite
	void addFavoriteMovie(int userId, int movieId) throws MovieNotFoundException;

	// fetch all Movies from given user Favorite
	ArrayList<Movie> getAllFavoriteMovies(int userId);

	// delete Movie from given user and Favorite
	void deleteFavoriteMovie(int userId, int movieId);
}
