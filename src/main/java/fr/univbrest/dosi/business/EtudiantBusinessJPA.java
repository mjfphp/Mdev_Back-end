package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.repository.EtudiantRepository;

@Service
public class EtudiantBusinessJPA implements EtudiantBusiness{

	EtudiantRepository etudiantRepo;
	@Autowired
	public EtudiantBusinessJPA(EtudiantRepository repos) {
		this.etudiantRepo = repos;
	}
	
	@Override
	public List<Etudiant> recupererTousLesEtudiants() {
		return (List<Etudiant>) etudiantRepo.findAll();
	}
}
