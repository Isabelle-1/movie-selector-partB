package com.example.MovieSelector.repository;

//anything to do with the database
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MovieSelector.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	//Query, tells the h2 database what to 
	@Query("select new Movie( mood, title) from Movie where upper (mood) = upper(:mood) order by rand() ")
	// List<Movie> findByMood(@Param("mood") String mood, @Param("numMovies")Long
	// numMovies);
	List<Movie> findByMood(@Param("mood") String mood);
}
