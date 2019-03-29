package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.repository.RubriqueRepository;

public class RubriqueRepositoryList  implements RubriqueRepository {

	private List<Rubrique> rubriques;
	
	public RubriqueRepositoryList () {
		
		rubriques = new ArrayList<>();
	}
	

	@Override
	public Iterable<Rubrique> findAll() {
		// TODO Auto-generated method stub
		return rubriques;
	}
	
	@Override
	public <S extends Rubrique> S save(S entity) {
		// TODO Auto-generated method stub
		rubriques.add(entity);
		return entity;
	}


	@Override
	public <S extends Rubrique> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rubrique findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Rubrique> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return rubriques.size();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Rubrique entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Rubrique> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Rubrique> findRubriqueEnseignant(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
