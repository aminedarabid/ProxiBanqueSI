package com.proxibanque.ProxiBanqueSI.domaine;

import java.sql.Date;

public abstract class CompteCourant extends CompteBancaire {

    private double acceptDecouvert;

    public CompteCourant(String id, double solde, Date dateCreation) {
        super(id, solde, dateCreation);
        this.acceptDecouvert = getAcceptDecouvert();
    }

    public double getAcceptDecouvert() {
        return acceptDecouvert;
    }

    public void setAcceptDecouvert() {
        this.acceptDecouvert = 1000.0;
    }
}
