package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;

public class FormationBusinessJPATest {
	
    private FormationBusinessJPA formationBusinessJPA;
    
    
    @Test
    public void TestSearchFormation(){
        assertThat(formationBusinessJPA.SearchFormationById("AAA")).isNotNull();
    }
}