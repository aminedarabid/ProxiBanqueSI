package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Embeddable
public class Conseiller extends Personne {

    private ArrayList listeClient;


    public Conseiller(String id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String email, ArrayList listeClient) {
        super(id, nom, prenom, adresse, codePostal, ville, telephone, email);
        listeClient = listeClient;
    }

    public ArrayList getListeClient() {
        return listeClient;
    }

    public void setListeClient(ArrayList listeClient) {
        this.listeClient = listeClient;
    }
}


