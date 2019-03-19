package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;

//@RunWith(SpringJUnit4ClassRunner.class)
public class FormationRepoitoryTest {
	
	FormationRepository formationRepository;

	Formation F1 = new Formation("M2DOSI","M2","O","Master developpement logiciel");
	Formation F2 = new Formation("M2SE","M2","N","Master systèmes embarqués");
	
	
	@Test
	public void addFormation() {
		formationRepository.save(F1);
		formationRepository.save(F2);
        assertThat(formationRepository.count()).isEqualTo(2);
		//assertThat(formationRepository.findAll()).isNotNull();
	}
	/*
	@Test
	public void doitCompterLesFormation(){
		List<Formation> Formations = (List<Formation>) formationRepository.findAll();
		assertThat(Formations).hasSize(1);
	}
	@Test
	public void doitRechercherParNomFormation() {
		List<Formation> formation = (List<Formation>) formationRepository.findOne("M2DOSI");
		assertThat(formation).hasSize(1);
	}*/
}
