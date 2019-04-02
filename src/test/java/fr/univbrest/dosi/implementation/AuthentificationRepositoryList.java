package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;


import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.repository.AuthentificationRepository;

public class AuthentificationRepositoryList implements AuthentificationRepository{

    private List<Authentification> authentifications;
    
    public AuthentificationRepositoryList() {
    	authentifications = new ArrayList<>();
    }

	@Override
	public List<Authentification> findAll() {
		return authentifications;
	}



	@Override
	public List<Authentification> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Authentification> List<S> save(Iterable<S> s) {
		return null;
	}



	@Override
	public <S extends Authentification> S save(S s) {
		this.authentifications.add(s);
		return s;
	}

	@Override
	public Authentification findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Authentification entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Authentification> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Authentification findByLoginConnection(String loginConnection) {
		for (Authentification authentification : authentifications)
            if (authentification.getLoginConnection().equals(loginConnection))
                return authentification;
		 return null;
	}

	@Override
	public Authentification findByPseudoConnection(String pseudoConnection) {
		// TODO Auto-generated method stub
		return null;
	}



	
}