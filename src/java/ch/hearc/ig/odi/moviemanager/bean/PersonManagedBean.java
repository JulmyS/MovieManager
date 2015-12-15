/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author JulmyS
 */
@Named(value = "people")
@SessionScoped
public class PersonManagedBean implements Serializable {

    @Inject
    Services services;

    private List<Person> people;

    public PersonManagedBean() {
    }

    /**
     * Récupère la liste des personnes
     *
     * @return la liste en question
     */
    public List<Person> getPeople() {
        return this.services.getPeopleList();
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

}
