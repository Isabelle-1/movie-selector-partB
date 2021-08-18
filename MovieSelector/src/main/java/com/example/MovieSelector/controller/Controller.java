package com.example.MovieSelector.controller;
//redirects you to what you need to use, tells you where to go

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.MovieSelector.entity.Movie;
import com.example.MovieSelector.service.MovieService;

@RequestMapping("api/v1/movie")
public class Controller {
	@Autowired
	MovieService movieService;

	public Controller(MovieService personService) {
		this.movieService = movieService;
	}

}
