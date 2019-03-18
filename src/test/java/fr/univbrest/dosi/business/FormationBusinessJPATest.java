package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repository.FormationRepository;
import fr.univbrest.dosi.repository.PromotionRepository;

//@RunWith(SpringJUnit4ClassRunner.class)
public class FormationBusinessJPATest {
	
    private FormationBusinessJPA formationBusinessJPA;
    
    Formation F1 = new Formation("M2DOSI","M2","O","Master developpement logiciel");
    
    @Test
    public void TestSearchFormation(){
        assertThat(formationBusinessJPA.SearchFormationById("M2DOSI")).isNotNull();
    }
    
    
    
    class PromotionRepositoryList implements PromotionRepository{

		@Override
		public <S extends Promotion> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Promotion> Iterable<S> save(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Promotion findOne(PromotionPK id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean exists(PromotionPK id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterable<Promotion> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Iterable<Promotion> findAll(Iterable<PromotionPK> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void delete(PromotionPK id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Promotion entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Iterable<? extends Promotion> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Promotion> findAllPromotionByCodeFormation(String idFormation) {
			// TODO Auto-generated method stub
			return null;
		}

    
    
    	
    	
    }
    
}