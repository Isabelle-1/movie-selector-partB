package com.example.MovieSelector.repository;
//anything to do with the database
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MovieSelector.entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository <Movie, Long>{

	@Query("select new Movie( mood, title) from Movie where mood = :mood")
	//List<Movie> findByMood(@Param("mood") String mood, @Param("numMovies")Long numMovies);
	List<Movie> findByMood(@Param("mood") String mood);
}
