package com.proxibanque.ProxiBanqueSI.DAO;

import java.sql.Date;

public interface ICompteBancaire {
    String getId();

    void setId(String id);

    double getSolde();

    void setSolde(double solde);

    Date getDateCreation();

    void setDateCreation(Date dateCreation);

    public void crediter();

    public void debiter();
}
