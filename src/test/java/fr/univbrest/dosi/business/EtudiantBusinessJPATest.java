package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.repository.EtudiantRepository;

public class EtudiantBusinessJPATest {

	EtudiantRepository etudiantRepository;
	EtudiantBusinessJPA etudiantBusinessJPA;
	Etudiant E1;
    @Before
    
    public void init () {
	//EtudiantRepository etudiantRepository = new EtudiantRepositoryList();
	 Etudiant E1 = new Etudiant("1","ETUDN1","ETUDP1");
    }
	 
	@Test
	public void testAddEtudiant() {
		
		EtudiantBusinessJPA etudiantBusinessJPA = new EtudiantBusinessJPA(etudiantRepository);
        Etudiant E3 = new Etudiant();
        E3.setNoEtudiant("1");
        E3.setNom("ETUDN1");
        E3.setPrenom("ETUDP1");
        etudiantBusinessJPA.CreateEtudiant(E3);
        assertThat(E3.getNoEtudiant()).isEqualTo(E1.getNoEtudiant());
        assertThat(E3.getNom()).isEqualTo(E1.getNom());
        assertThat(E3.getPrenom()).isEqualTo(E1.getPrenom());
	
	}
	
	@Test
	public void testDeleteEtudiant() {
	
		EtudiantBusinessJPA etudiantBusinessJPA = new EtudiantBusinessJPA(etudiantRepository);
        Etudiant E3 = new Etudiant();
        E3.setNoEtudiant("1");
        E3.setNom("ETUDN1");
        E3.setPrenom("ETUDP1");
        etudiantBusinessJPA.CreateEtudiant(E3);
        assertThat(E3.getNoEtudiant()).isEqualTo(E1.getNoEtudiant());
        assertThat(E3.getNom()).isEqualTo(E1.getNom());
        assertThat(E3.getPrenom()).isEqualTo(E1.getPrenom()); 
        etudiantBusinessJPA.deleteEtudiant(E3.getNoEtudiant());
        assertThat(E3.getNoEtudiant()).isNull();	
		
	}  
}



	 
   
