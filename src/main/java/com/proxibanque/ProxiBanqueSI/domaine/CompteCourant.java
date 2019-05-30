package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
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
