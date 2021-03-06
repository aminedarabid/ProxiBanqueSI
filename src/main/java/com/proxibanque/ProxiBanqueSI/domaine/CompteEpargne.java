package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public abstract class CompteEpargne extends CompteBancaire {

    private double tauxRemuneration;

    public CompteEpargne(String id, double solde, Date dateCreation) {
        super(id, solde, dateCreation);
        this.tauxRemuneration = getTauxRemuneration();
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration() {
        this.tauxRemuneration = 3;
    }
}
