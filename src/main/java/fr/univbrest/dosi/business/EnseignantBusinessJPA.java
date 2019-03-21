package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.repository.EnseignantRepository;

@Service
public class EnseignantBusinessJPA implements EnseignantBusiness{

	private EnseignantRepository enseignantRepository;
	
	@Autowired
	public EnseignantBusinessJPA(EnseignantRepository enseignantRepository) {
		this.enseignantRepository = enseignantRepository;
	}

	// method call to get all Enseignants
	public List<Enseignant> getAllEnseignant() {
		return (List<Enseignant>) enseignantRepository.findAll();
	}


}