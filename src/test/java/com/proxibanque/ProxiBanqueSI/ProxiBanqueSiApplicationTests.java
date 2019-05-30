package com.proxibanque.ProxiBanqueSI;

import com.proxibanque.ProxiBanqueSI.DAO.IClientDao;
import com.proxibanque.ProxiBanqueSI.domaine.Client;
import com.proxibanque.ProxiBanqueSI.domaine.Personne;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxiBanqueSiApplicationTests {

	private Personne personne;
	private Client client;
	private IClientDao springDao;
	private ClassPathXmlApplicationContext appContext;

	/**
	 * Initialisation du contexte Spring et du bean du Dao.
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		personne = new Personne("13456", "testnom","testprenom", "8 cdcsdc", "1234", "ezeza","dsqdqs", "sqdsqd");
		appContext = new ClassPathXmlApplicationContext("src/main/webapp/WEB-INF/application-servlet.xml");
		springDao = (IClientDao) appContext.getBean("IClientDao");
	}

	/**
	 * Sauvegarde du bean par l’interface Repository de Spring Data
	 */
	@Test
	public void saveClient() {
		Client result = springDao.save(client);
		System.out.println("Formation ajoutée en base : " + result.toString());
	}

	/**
	 * Affichage des éléments en base
	 */
    /*@Test
    public void testListClient() {
        springDao = (IClientDao) appContext.getBean("IClientDao");
        List<Client> client = springDao.findByNomContaining(client.getNom());
        for (Client e : client) {
            System.out.println(e.getNom());
        }
        Assert.assertNotNull(client);
    }*/

}
