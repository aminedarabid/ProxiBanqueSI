package com.proxibanque.ProxiBanqueSI.domaine;

import java.util.ArrayList;

public class Conseiller extends Personne {

    private ArrayList ListeClient;


    public Conseiller(String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String email) {
        super(nom, prenom, adresse, codePostal, ville, telephone, email);
    }
}


