/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.util.List;

/**
 *
 * @author JulmyS
 */
public class Person {
    
    private Long id;
    private String firstName;
    private String lastName;
    private List<Movie> listeFilm;

    public Person() {
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

    public List<Movie> getListeFilm() {
        return listeFilm;
    }

    public void setListeFilm(List<Movie> listeFilm) {
        this.listeFilm = listeFilm;
    }
    
    
    
}
