package com.proxibanque.ProxiBanqueSI.DAO;

import com.proxibanque.ProxiBanqueSI.domaine.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClientDao extends JpaRepository<Client, Integer> {

    List<Client> findByNomContaining(String keyword);
}
