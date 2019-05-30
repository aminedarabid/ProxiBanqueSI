package com.proxibanque.ProxiBanqueSI.domaine;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Embeddable
public class Conseiller extends Personne {

    private ArrayList listeClient;
    private String login;
    private String password

    public Conseiller(ArrayList listeClient, String login, String password) {
        this.listeClient = listeClient;
        this.login = login;
        this.password = password;
    }

    public ArrayList getListeClient() {
        return listeClient;
    }

    public void setListeClient(ArrayList listeClient) {
        this.listeClient = listeClient;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


