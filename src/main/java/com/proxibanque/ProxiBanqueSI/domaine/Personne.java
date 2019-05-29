package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String CodePostal;
    private String Ville;
    private String Telephone;
    private String email;

    public Personne(int id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String email) {
        Id = id;
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
        CodePostal = codePostal;
        Ville = ville;
        Telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String codePostal) {
        CodePostal = codePostal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
