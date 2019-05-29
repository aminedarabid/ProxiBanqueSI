package com.proxibanque.ProxiBanqueSI.domaine;

import com.proxibanque.ProxiBanqueSI.DAO.ICompteBancaire;

public class Virement {

    private ICompteBancaire compteEmeteur;
    private ICompteBancaire compteBeneficiaire;
    private double montant;

    public Virement(ICompteBancaire compteEmeteur, ICompteBancaire compteBeneficiaire, double montant) {
        this.compteEmeteur = compteEmeteur;
        this.compteBeneficiaire = compteBeneficiaire;
        this.montant = montant;
    }

    public ICompteBancaire getCompteEmeteur() {
        return compteEmeteur;
    }

    public void setCompteEmeteur(ICompteBancaire compteEmeteur) {
        this.compteEmeteur = compteEmeteur;
    }

    public ICompteBancaire getCompteBeneficiaire() {
        return compteBeneficiaire;
    }

    public void setCompteBeneficiaire(ICompteBancaire compteBeneficiaire) {
        this.compteBeneficiaire = compteBeneficiaire;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
