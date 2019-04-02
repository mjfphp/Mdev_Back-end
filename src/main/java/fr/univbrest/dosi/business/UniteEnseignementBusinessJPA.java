package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.repository.UniteEnseignementRepository;


@Service
public class UniteEnseignementBusinessJPA implements UniteEnseignementBusiness {
	
	UniteEnseignementRepository repository;

	public UniteEnseignementBusinessJPA(UniteEnseignementRepository repository) {
				this.repository = repository;
	}

	@Override
	public List<UniteEnseignement> GetAllUniteEnseignementForEnseignantAndCodeFormation(Integer noEnseignant,
			String codeFormation) {
		// TODO Auto-generated method stub
		return repository.GetAllUniteEnseignementForEnseignantAndCodeFormation(noEnseignant, codeFormation);
	}

}
