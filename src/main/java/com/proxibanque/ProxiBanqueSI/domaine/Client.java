package com.proxibanque.ProxiBanqueSI.domaine;

public class Client extends Personne {

    private CompteEpargne cptEpargne;
    private CompteCourant cptCourant;
    private boolean fortune;

    public Client(String  id, String nom, String prenom, String adresse, String codePostal, String ville, String telephone, String email, CompteEpargne cptEpargne, CompteCourant cptCourant, boolean fortune) {
        super(id, nom, prenom, adresse, codePostal, ville, telephone, email);
        this.cptEpargne = cptEpargne;
        this.cptCourant = cptCourant;
        this.fortune = fortune;
    }

    public CompteEpargne getcptEpargne() {
        return cptEpargne;
    }

    public void setcptEpargne(CompteEpargne cptEpargne) {
        this.cptEpargne = cptEpargne;
    }

    public CompteCourant getCptCourant() {
        return cptCourant;
    }

    public void setCptCourant(CompteCourant cptCourant) {
        this.cptCourant = cptCourant;
    }

    public boolean getFortune() {
        return fortune;
    }

    public void setFortune(boolean fortune) {
        this.fortune = fortune;
    }
}
