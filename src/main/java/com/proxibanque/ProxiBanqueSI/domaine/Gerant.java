package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Embeddable;


@Embeddable
public class Gerant extends Personne {

    public Gerant(String id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String email) {
        super(id, nom, prenom, adresse, codePostal, ville, telephone, email);
    }
}
