package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.business.EtudiantBusinessJPA;
import fr.univbrest.dosi.implementation.EtudiantRepositoryList;

@RunWith(SpringJUnit4ClassRunner.class)
public class EtudiantRepositoryTest {

	EtudiantRepository etudiantRep;
	EtudiantBusinessJPA etudiantBusinessJPA;
	Etudiant E1;

	@Test
	public void testAddEtudiant() {

		EtudiantRepositoryList etudiantRep = new EtudiantRepositoryList();
		Etudiant E3 = new Etudiant();
		E3.setNoEtudiant("1");
		E3.setNom("ETUDN1");
		E3.setPrenom("ETUDP1");
		E1 = etudiantRep.save(E3);
		assertThat(E3.getNoEtudiant()).isEqualTo(E1.getNoEtudiant());
		assertThat(E3.getNom()).isEqualTo(E1.getNom());
		assertThat(E3.getPrenom()).isEqualTo(E1.getPrenom());

	}

	@Test
	public void testDeleteEtudiant() {
		EtudiantRepositoryList etudiantRep = new EtudiantRepositoryList();

		Etudiant E3 = new Etudiant("1", "ETUDN1", "ETUDP1");
		Etudiant E = etudiantRep.save(E3);
		assertThat(E3.getNoEtudiant()).isEqualTo(E.getNoEtudiant());
		assertThat(E3.getNom()).isEqualTo("ETUDN1");
		assertThat(E3.getPrenom()).isEqualTo("ETUDP1");
		etudiantRep.delete(E3.getNoEtudiant());
		List<Etudiant> list = (List<Etudiant>) etudiantRep.findAll();
		boolean exists = (list.contains(E)) ? true : false;
		assertThat(exists).isFalse();

	}

	@Test
	public void testListEtudiant() {
		EtudiantRepositoryList etudiantRep = new EtudiantRepositoryList();
		Etudiant E1 = new Etudiant("1", "ETUDN1", "ETUDP1");
		Etudiant E2 = new Etudiant("2", "ETUDN1", "ETUDP1");
		etudiantRep.save(E1);
		etudiantRep.save(E2);
		List<Etudiant> list = (List<Etudiant>) etudiantRep.findAll();
		boolean E1exists = (list.contains(E1)) ? true : false;
		assertThat(E1exists).isTrue();
		boolean E2exists = (list.contains(E2)) ? true : false;
		assertThat(E2exists).isTrue();
	}
	
	
}
