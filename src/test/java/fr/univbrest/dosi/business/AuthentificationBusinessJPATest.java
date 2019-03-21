package fr.univbrest.dosi.business;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.implementation.AuthentificationRepositoryList;
import fr.univbrest.dosi.repository.AuthentificationRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class AuthentificationBusinessJPATest extends AuthentificationRepositoryList {

	AuthentificationBusinessJPA authentificationBusinessJPA;
	AuthentificationRepository authentificationRepository = new AuthentificationRepositoryList();
	
	Authentification U1 = new Authentification(1,"admin","admin");
	Authentification U2 = new Authentification(1,"user","user");

	@Test
    public void testFormation(){
    	Assert.assertNotNull(U1.getIdConnection());
    }
	
   @Test
   public void testRecupererTousLesUsers(){
	   AuthentificationRepository authentificationRepository = new AuthentificationRepositoryList();
	   AuthentificationBusinessJPA authentificationBusinessJPA = new AuthentificationBusinessJPA(authentificationRepository);
	   authentificationRepository.save(U1);
	   authentificationRepository.save(U2);
	   List<Authentification> L1 = new ArrayList<Authentification>();
	   L1 = authentificationBusinessJPA.recupererTousLesusers();
	   Assert.assertEquals(L1, authentificationRepository.findAll());
    }
   
   @Test
   public void testSearchByEmail(){
	   AuthentificationRepository authentificationRepository = new AuthentificationRepositoryList();
	   AuthentificationBusinessJPA authentificationBusinessJPA = new AuthentificationBusinessJPA(authentificationRepository);
	   authentificationRepository.save(U1);
	   Authentification P = authentificationBusinessJPA.SearchByEmail(U1.getLoginConnection());
	   Assert.assertEquals(U1.getLoginConnection(),P.getLoginConnection());
    }
    
}
