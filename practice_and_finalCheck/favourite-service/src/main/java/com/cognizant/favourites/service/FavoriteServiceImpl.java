package com.cognizant.favourites.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.favourites.exception.MovieNotFoundException;
import com.cognizant.favourites.model.Movie;
import com.cognizant.favourites.dao.FavoriteDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FavoriteServiceImpl implements FavoriteService {
	
	@Autowired
	FavoriteDao favoriteDao;
	
	@Override
	public void addFavoriteMovie(int userId, int movieId) throws MovieNotFoundException {
		favoriteDao.addFavoriteMovie(userId, movieId);

	}

	@Override
	public ArrayList<Movie> getAllFavoriteMovies(int userId) {
		
		return favoriteDao.getAllFavoriteMovies(userId);
	}

	@Override
	public void deleteFavoriteMovie(int userId, int movieId) {
		
		favoriteDao.deleteFavoriteMovie(userId, movieId);

	}

}
