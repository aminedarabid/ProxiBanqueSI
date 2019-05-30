package com.proxibanque.ProxiBanqueSI.DAO;

import com.proxibanque.ProxiBanqueSI.domaine.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientDao extends JpaRepository<Client, Integer> {

    List<Client> findByNomContaining(String keyword);
}
