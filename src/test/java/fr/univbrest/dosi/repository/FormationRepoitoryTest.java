package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.implementation.FormationRepositoryList;
import fr.univbrest.dosi.repository.FormationRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class FormationRepoitoryTest extends FormationRepositoryList {
	
	FormationRepository formationRepository;

	Formation F1 = new Formation("M2DOSI","M2","O","Master developpement logiciel");
	Formation F2 = new Formation("M2SE","M2","N","Master systèmes embarqués");
	
	@Test
	public void addFormation() {
		formationRepository = new FormationRepositoryList();
		formationRepository.save(F1);
		formationRepository.save(F2);
        assertThat(formationRepository.count()).isEqualTo(2);
	}
	
	@Test
	public void testListFormations(){
		formationRepository = new FormationRepositoryList();
		formationRepository.save(F1);
		formationRepository.save(F2);
		List<Formation> Formations = (List<Formation>) formationRepository.findAll();
		assertThat(Formations).hasSize(2);
	}
   
}
