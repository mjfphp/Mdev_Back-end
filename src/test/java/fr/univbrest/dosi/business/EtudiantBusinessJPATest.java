package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.repository.EtudiantRepository;

public class EtudiantBusinessJPATest {
	
	 EtudiantBusinessJPA etudiantBusinessJPA;
	 EtudiantRepository etudiantRepository = new EtudiantRepositoryList();
	 
	 Etudiant E1 = new Etudiant("1","EtuN1","EtuP1");
	 Etudiant E2 = new Etudiant("2","EtuN2","EtuP2");
	 
	 @Test
	    public void testEtudiant(){
	    	Assert.assertNotNull(E1.getNoEtudiant());
	    }
	 
	 @Test
	    public void testAddEtudiant() {
		 EtudiantBusinessJPA etudiantBusinessJPA = new EtudiantBusinessJPA(etudiantRepository);
		 Etudiant E3 = new Etudiant();
		 E3.setNoEtudiant("3");
		 etudiantBusinessJPA.CreateEtudiant(E3);
		 assertThat(E3.getNoEtudiant()).isEqualTo("3");
	   }

	 
    class EtudiantRepositoryList implements EtudiantRepository{

    	private List<Etudiant> etudiants;
    	
    	public EtudiantRepositoryList() {
    		etudiants = new ArrayList<>();
        }
    	
		@Override
		public <S extends Etudiant> S save(S s) {
			this.etudiants.add(s);
			return s;
		}

		@Override
		public <S extends Etudiant> Iterable<S> save(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Etudiant findOne(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean exists(String id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterable<Etudiant> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Iterable<Etudiant> findAll(Iterable<String> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void delete(String id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Etudiant entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Iterable<? extends Etudiant> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Etudiant> findByPromotion(Promotion p) {
			// TODO Auto-generated method stub
			return null;
		}

		
    }
}