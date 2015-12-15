/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.service.Services;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author JulmyS
 */
@Named(value = "filmDetail")
@SessionScoped
public class FilmDetailManagedBean implements Serializable {

    @Inject
    Services services;
    
    private Movie movie;
    
    public FilmDetailManagedBean() {
    }
    
    public String saveMovie(int id){
        for (Movie mov : services.getMoviesList()) {
            if(mov.getId() == id){
                movie = mov;
            }
        }
        return "detailFilm";
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    
    
}
