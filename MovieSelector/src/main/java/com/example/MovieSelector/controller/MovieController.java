package com.example.MovieSelector.controller;
//redirects you to what you need to use, tells you where to go

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.example.MovieSelector.entity.Movie;
import com.example.MovieSelector.service.MovieService;


@Controller
public class MovieController {
	@Autowired
	MovieService movieService;

	public MovieController(MovieService personService) {
		this.movieService = movieService;
	}

}
