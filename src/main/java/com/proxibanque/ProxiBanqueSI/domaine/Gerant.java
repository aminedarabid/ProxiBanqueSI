package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;


@Entity
public class Gerant extends Personne {


    private String password

    public Gerant(String password) {
        super(id, nom, prenom, adresse, codePostal, ville, telephone, email);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
