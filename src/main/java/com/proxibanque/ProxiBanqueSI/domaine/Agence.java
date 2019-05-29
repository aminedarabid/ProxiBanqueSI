package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private Date dateCreation;

    public Agence(String id, Date dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
