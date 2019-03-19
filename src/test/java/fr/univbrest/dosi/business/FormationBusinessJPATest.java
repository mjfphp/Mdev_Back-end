package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class FormationBusinessJPATest {
	
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
    
    class FormationRepositoryList implements FormationRepository{

        private List<Formation> formations;
        
        public FormationRepositoryList() {
            formations = new ArrayList<>();
        }
    	
		@Override
		public <S extends Formation> S save(S s) {
			this.formations.add(s);
			return s;
		}
		
		@Override
		public <S extends Formation> Iterable<S> save(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Formation findOne(String id) {
			return F1;
		}

		@Override
		public boolean exists(String id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterable<Formation> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Iterable<Formation> findAll(Iterable<String> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long count() {
            return this.formations.size();
		}

		@Override
		public void delete(String id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Formation entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Iterable<? extends Formation> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		
    }
    
}