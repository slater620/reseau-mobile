package com.example.springauthentification.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.*;

@Entity
@Table


public class BusinessUser extends User{
    @Column(name = "localisation")
    protected String localisation;
    @Column(name = "adresse")
    protected String adresse;
    @Column(name = "name_business")

    public String getLocalisation() {
        return this.localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getName_business() {
        return this.name_business;
    }

    @Override
    public String toString() {
        return "{" +
            " localisation='" + getLocalisation() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", name_business='" + getName_business() + "'" +
            ", horaire='" + getHoraire() + "'" +
            "}";
    }

    public void setName_business(String name_business) {
        this.name_business = name_business;
    }

    public String getHoraire() {
        return this.horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
    protected String name_business;
    @Column(name = "horaire")
    protected String horaire;
}
