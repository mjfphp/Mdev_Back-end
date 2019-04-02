package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.repository.EtudiantRepository;

@Service
public class EtudiantBusinessJPA implements EtudiantBusiness {

	// declaration de notre repo qui se base sur CRUDRepo

	EtudiantRepository etudiantrepo;

	// faire la laision entre EtudiantBusinessJPA et EtudiantRepository

	@Autowired
	public EtudiantBusinessJPA(EtudiantRepository repos) {
		this.etudiantrepo = repos;
	}

	// fonction de creation de l'objet etudiant

	@Override
	public Etudiant CreateEtudiant(Etudiant etud) {
		// TODO Auto-generated method stub
		return etudiantrepo.save(etud);
	}

	// fonction qui retourne une liste de tous les etudiants

	@Override
	public List<Etudiant> GetAllEtudiants() {
		// TODO Auto-generated method stub
		return (List<Etudiant>) etudiantrepo.findAll();
	}

	// fonction de suppression de l'objet etudiant selon son ID

	@Override
	public void deleteEtudiant(String NO_ETUDIANT) {
		// TODO Auto-generated method stub
		etudiantrepo.delete(NO_ETUDIANT);

	}

	// fonction qui retourne une liste des etudiants selon une promotion donnee

	@Override
	public List<Etudiant> GetEtudiantPromotions(Promotion p) {
		// TODO Auto-generated method stub
		return (List<Etudiant>) etudiantrepo.findByPromotion(p);
	}

}
