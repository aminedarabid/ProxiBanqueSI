package com.proxibanque.ProxiBanqueSI.service;

import com.proxibanque.ProxiBanqueSI.DAO.IClientDao;
import com.proxibanque.ProxiBanqueSI.domaine.Client;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private IClientDao iClientDao;

    public List<Client> getAll(){
        return iClientDao.findAll();
    }

    public void create(Client newclient){
        iClientDao.save(newclient);
    }

    public void deleteForm(Integer id){
        iClientDao.deleteById(id);
    }

    public Client updateForm(Integer id){
        return iClientDao.getOne(id);
    }

    public Client valideUpdate(Client client) {
        return this.iClientDao.save(client);
    }

    public List<Client> find(String keyword) {
        List<Client> results = new ArrayList<Client>();
        String[] keywords = keyword.split("[ -]");
        for(String word: keywords) {
            results.addAll(this.iClientDao.findByNomContaining(word));
        }
        return results;
    }
}
