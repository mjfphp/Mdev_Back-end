package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.repository.EtudiantRepository;
import fr.univbrest.dosi.implementation.EtudiantRepositoryList;

@RunWith(SpringJUnit4ClassRunner.class)
public class EtudiantBusinessJPATest {

	EtudiantRepository etudiantRep;
	EtudiantBusinessJPA etudiantBusinessJPA;
	Etudiant E1;

	@Test
	public void testAddEtudiant() {

		EtudiantRepositoryList etudiantRep = new EtudiantRepositoryList();

		EtudiantBusinessJPA etudiantBusinessJPA = new EtudiantBusinessJPA(etudiantRep);
		Etudiant E3 = new Etudiant();
		E3.setNoEtudiant("1");
		E3.setNom("ETUDN1");
		E3.setPrenom("ETUDP1");
		E1 = etudiantBusinessJPA.CreateEtudiant(E3);
		assertThat(E3.getNoEtudiant()).isEqualTo(E1.getNoEtudiant());
		assertThat(E3.getNom()).isEqualTo(E1.getNom());
		assertThat(E3.getPrenom()).isEqualTo(E1.getPrenom());

	}

	@Test
	public void testDeleteEtudiant() {
		EtudiantRepositoryList etudiantRep = new EtudiantRepositoryList();
		EtudiantBusinessJPA etudiantBusinessJPA = new EtudiantBusinessJPA(etudiantRep);

		Etudiant E3 = new Etudiant("1", "ETUDN1", "ETUDP1");
		Etudiant E = etudiantBusinessJPA.CreateEtudiant(E3);
		assertThat(E3.getNoEtudiant()).isEqualTo(E.getNoEtudiant());
		assertThat(E3.getNom()).isEqualTo("ETUDN1");
		assertThat(E3.getPrenom()).isEqualTo("ETUDP1");
		etudiantBusinessJPA.deleteEtudiant(E3.getNoEtudiant());
		List<Etudiant> list = etudiantBusinessJPA.GetAllEtudiants();
		boolean exists = (list.contains(E)) ? true : false;
		assertThat(exists).isFalse();

	}

	@Test
	public void testListEtudiant() {
		EtudiantRepositoryList etudiantRep = new EtudiantRepositoryList();
		EtudiantBusinessJPA etudiantBusinessJPA = new EtudiantBusinessJPA(etudiantRep);

		Etudiant E1 = new Etudiant("1", "ETUDN1", "ETUDP1");
		Etudiant E2 = new Etudiant("2", "ETUDN1", "ETUDP1");
		etudiantBusinessJPA.CreateEtudiant(E1);
		etudiantBusinessJPA.CreateEtudiant(E2);
		List<Etudiant> list = etudiantBusinessJPA.GetAllEtudiants();
		boolean E1exists = (list.contains(E1)) ? true : false;
		assertThat(E1exists).isTrue();
		boolean E2exists = (list.contains(E2)) ? true : false;
		assertThat(E2exists).isTrue();
	}

}
