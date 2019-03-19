package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, String> {
	
	// fonction qui retourne une liste des objets etudiant selon la promotion fournie
	
	public List<Etudiant> findByPromotion(Promotion p);
	
	
}
