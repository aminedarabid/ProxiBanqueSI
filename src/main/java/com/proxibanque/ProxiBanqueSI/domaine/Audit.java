package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;

@Entity
public class Audit {

    private float plafondDecouvertEntreprise;
    private float plafondDecouvertParticulier;

    public Audit(float plafondDecouvertEntreprise, float plafondDecouvertParticulier) {
        this.plafondDecouvertEntreprise = plafondDecouvertEntreprise;
        this.plafondDecouvertParticulier = plafondDecouvertParticulier;
    }

    public float getPlafondDecouvertEntreprise() {
        return plafondDecouvertEntreprise;
    }

    public void setPlafondDecouvertEntreprise(float plafondDecouvertEntreprise) {
        this.plafondDecouvertEntreprise = plafondDecouvertEntreprise;
    }

    public float getPlafondDecouvertParticulier() {
        return plafondDecouvertParticulier;
    }

    public void setPlafondDecouvertParticulier(float plafondDecouvertParticulier) {
        this.plafondDecouvertParticulier = plafondDecouvertParticulier;
    }
}
