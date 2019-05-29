package com.proxibanque.ProxiBanqueSI.domaine;

import com.proxibanque.ProxiBanqueSI.DAO.ICompteBancaire;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public abstract class CompteBancaire implements ICompteBancaire {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private double solde;
    private Date dateCreation;

    public CompteBancaire(String id, double solde, Date dateCreation) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public Date getDateCreation() {
        return dateCreation;
    }

    @Override
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
