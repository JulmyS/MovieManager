/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author JulmyS
 */
@Named(value = "personDetail")
@SessionScoped
public class PersonDetailManagedBean implements Serializable{
    
    @Inject
    Services services;
    
    private Person person;

    public PersonDetailManagedBean() {
    }

    /**
     * Méthode qui enregistre la personne en mémoire
     * @param id
     * @return 
     */
    public String savePerson(int id) {
        for (Person pers : services.getPeopleList()) {
            if(pers.getId() == id){
                this.person = pers;
            }
        }
        return "detailClient";
    }

    public Person getPerson() {
        return person;
    }
    

    public void setPerson(Person person) {
        this.person = person;
    }
}
