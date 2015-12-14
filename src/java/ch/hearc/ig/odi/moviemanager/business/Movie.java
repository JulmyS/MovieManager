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
public class Movie {
    private Long id;
    private String name;
    private String producer;
    
    private List<Person> listePersonne ;

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<Person> getListePersonne() {
        return listePersonne;
    }

    public void setListePersonne(List<Person> listePersonne) {
        this.listePersonne = listePersonne;
    }
    
    
    
}
