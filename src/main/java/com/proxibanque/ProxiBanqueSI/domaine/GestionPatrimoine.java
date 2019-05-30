package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;


public class GestionPatrimoine {

    private double seuilPatrimoine;

    public GestionPatrimoine(double seuilPatrimoine) {
        this.seuilPatrimoine = seuilPatrimoine;
    }

    public double getSeuilPatrimoine() {
        return seuilPatrimoine;
    }

    public void setSeuilPatrimoine(double seuilPatrimoine) {
        this.seuilPatrimoine = seuilPatrimoine;
    }
}
