package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repository.EtudiantRepository;
import javax.persistence.Entity;

@Service
public class EtudiantBusinessJPA implements EtudiantBusiness {

	EtudiantRepository etudiantrepo; 
	
	@Autowired
	public EtudiantBusinessJPA(EtudiantRepository repos) {
		this.etudiantrepo = repos;
	}
	@Override
	public Etudiant CreateEtudiant(Etudiant etud) {
		// TODO Auto-generated method stub
		return etudiantrepo.save(etud);
	}

	@Override
	public List<Etudiant> GetAllEtudiants() {
		// TODO Auto-generated method stub
		return (List<Etudiant>) etudiantrepo.findAll();
	}

	@Override
	public void deleteEtudiant(String NO_ETUDIANT) {
		// TODO Auto-generated method stub
		etudiantrepo.delete(NO_ETUDIANT);
		
	}
	@Override
	public List<Etudiant> GetEtudiantPromotions(Promotion p) {
		// TODO Auto-generated method stub
		return (List<Etudiant>)etudiantrepo.findByPromotion(p);
	}


}
