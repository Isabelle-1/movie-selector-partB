package com.example.MovieSelector.repository;
//anything to do with the database
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieSelector.entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository <Movie, Long>{

	List<Movie> findByMood(String mood);
}
