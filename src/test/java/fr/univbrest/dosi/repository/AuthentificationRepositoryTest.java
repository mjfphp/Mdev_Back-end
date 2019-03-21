package fr.univbrest.dosi.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.business.AuthentificationBusinessJPA;
import fr.univbrest.dosi.implementation.AuthentificationRepositoryList;

@RunWith(SpringJUnit4ClassRunner.class)
public class AuthentificationRepositoryTest extends AuthentificationRepositoryList {

	AuthentificationRepository authentificationRepository = new AuthentificationRepositoryList();
	
	Authentification U1 = new Authentification(1,"admin","admin");
	Authentification U2 = new Authentification(1,"user","user");
	
	@Test
	public void testRecupererTousLesUsers(){
		AuthentificationRepository authentificationRepository = new AuthentificationRepositoryList();
		authentificationRepository.save(U1);
		authentificationRepository.save(U2);
		List<Authentification> L1 = new ArrayList<Authentification>();
		L1 = authentificationRepository.findAll();
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
