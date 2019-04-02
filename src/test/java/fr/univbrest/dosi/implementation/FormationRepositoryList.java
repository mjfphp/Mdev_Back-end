package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;

public class FormationRepositoryList implements FormationRepository{

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
		 for (Formation formation : formations)
             if (formation.getCodeFormation().equals(id))
                 return formation;
		 return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return formations;
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