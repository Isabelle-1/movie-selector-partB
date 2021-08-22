package com.example.MovieSelector.entity;

import javax.persistence.Column;
//the object itself
//used to map to something that makes sense from the database eg mood.
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	// store mood and title
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "mood")
	private String mood;

	@Column(name = "title")
	private String title;

	// constructor
	public Movie(String mood, String title) {
		super();
		this.mood = mood;
		this.title = title;
	}

	// empty constructor
	public Movie() {

	}

	@Override
	public String toString() {
		return title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		System.out.println("setmoood");
		this.mood = mood;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
