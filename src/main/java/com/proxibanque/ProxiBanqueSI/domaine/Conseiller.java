package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Conseiller extends Personne {

    private ArrayList listeClient;
    private String password;

    public Conseiller(ArrayList listeClient, String password)
    {
        super(id, nom, prenom, adresse, codePostal, ville, telephone, email);
        this.listeClient = listeClient;
        this.password = password;
    }

    public ArrayList getListeClient() {
        return listeClient;
    }

    public void setListeClient(ArrayList listeClient) {
        this.listeClient = listeClient;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


