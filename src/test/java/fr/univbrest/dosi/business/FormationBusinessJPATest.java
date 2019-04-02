package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;
import fr.univbrest.dosi.implementation.FormationRepositoryList;


@RunWith(SpringJUnit4ClassRunner.class)
public class FormationBusinessJPATest extends FormationRepositoryList {
	
    FormationBusinessJPA formationBusinessJPA;
    FormationRepository formationRepository = new FormationRepositoryList();
        
	Formation F1 = new Formation("M2DOSI","M2","O","Master developpement logiciel");
	Formation F2 = new Formation("M2SE","M2","N","Master systèmes embarqués");
	
    @Test
    public void testFormation(){
    	Assert.assertNotNull(F1.getCodeFormation());
    }
    
    @Test
    public void testSearchFormation(){
    	FormationBusinessJPA formationBusinessJPA = new FormationBusinessJPA(formationRepository, null);
    	formationBusinessJPA.AddFormation(F1);
    	Formation Ftest = formationBusinessJPA.SearchFormationById("M2DOSI");
		assertThat(Ftest.getCodeFormation()).isEqualTo("M2DOSI");
    }
 
    @Test
    public void testListFormation(){
        FormationRepository formationRepository = new FormationRepositoryList();
    	FormationBusinessJPA formationBusinessJPA = new FormationBusinessJPA(formationRepository, null);
    	formationBusinessJPA.AddFormation(F1);
    	formationBusinessJPA.AddFormation(F2);
        assertThat(formationRepository.count()).isEqualTo(2);
    }
    
}