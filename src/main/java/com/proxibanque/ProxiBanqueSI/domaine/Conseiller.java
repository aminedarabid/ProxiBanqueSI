package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Conseiller extends Personne {

    private ArrayList ListeClient;


    public Conseiller(String id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String email, ArrayList listeClient) {
        super(id, nom, prenom, adresse, codePostal, ville, telephone, email);
        ListeClient = listeClient;
    }

    public ArrayList getListeClient() {
        return ListeClient;
    }

    public void setListeClient(ArrayList listeClient) {
        this.ListeClient = listeClient;
    }
}


