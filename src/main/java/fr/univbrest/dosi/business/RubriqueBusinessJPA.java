package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.repository.RubriqueRepository;

@Service
public class RubriqueBusinessJPA implements RubriqueBusiness {

	 RubriqueRepository repo;
	
	@Autowired
	public RubriqueBusinessJPA(RubriqueRepository reporubrique) {
		this.repo = reporubrique;
	}
	
	@Override
	public List<Rubrique> GetAllRubrique(int id ) {
		// TODO Auto-generated method stub
		return (List<Rubrique>) repo.findRubriqueEnseignant(id);
	}

}
