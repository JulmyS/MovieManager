/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JulmyS
 */
public class Person {
    
    private Long id;
    private String firstName;
    private String lastName;
    private List<Movie> movies;

    public Person() {
        this.movies = new ArrayList<>();
    }

    public Person(Long id, String firstName, String lastName) {
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
