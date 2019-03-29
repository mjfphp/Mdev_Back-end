package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.business.RubriqueBusinessJPA;
import fr.univbrest.dosi.implementation.RubriqueRepositoryList;

@RunWith(SpringJUnit4ClassRunner.class)

public class RubriqueRepositoryTest {

	RubriqueBusinessJPA business ; 
	RubriqueRepositoryList repo = new RubriqueRepositoryList();
	
	@Test
	public void TestListRubriques() {
		repo = new RubriqueRepositoryList();
		Rubrique r1 = new Rubrique(0, "test", 0, "test", null);
		repo.save(r1);
		assertThat(repo.count()).isEqualTo(1);
	}
	
}
