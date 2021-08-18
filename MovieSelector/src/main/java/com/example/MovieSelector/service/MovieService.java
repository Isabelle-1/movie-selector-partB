package com.example.MovieSelector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieSelector.entity.Movie;
import com.example.MovieSelector.repository.MovieRepository;


//all the logic is here'
@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


}
