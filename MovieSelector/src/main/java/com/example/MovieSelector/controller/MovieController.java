package com.example.MovieSelector.controller;
//redirects you to what you need to use, tells you where to go

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.MovieSelector.entity.Movie;
import com.example.MovieSelector.repository.MovieRepository;

import com.example.MovieSelector.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	MovieService movieService;
	@Autowired
	MovieRepository movieRepo;

	public MovieController(MovieService movieService) {
		System.out.println("Movie service");
		this.movieService = movieService;
	}

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Movie());
		// calls the greeting.html file
		return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Movie greeting, Model model) {
		System.out.println("first print");
		String x = greeting.getId().toString();
		int numMovies = Integer.valueOf(x);
		if (numMovies < 0) {
			numMovies = 0;
		}
		model.addAttribute("greeting", greeting);
		System.out.println("hello world");
		List movieList = movieRepo.findByMood(greeting.getMood());

		if (numMovies >= movieList.size()) {
			model.addAttribute("movies4U", movieList);
		} else {
			List<Movie> smallList = movieList.subList(0, numMovies);
			model.addAttribute("movies4U", smallList);
		}
		for (int i = 0; i < movieList.size(); i++) {
			Movie c = (Movie) movieList.get(i);
			System.out.println(c.getTitle());
		}
		// calls the result.html file
		return "result";

	}

}
