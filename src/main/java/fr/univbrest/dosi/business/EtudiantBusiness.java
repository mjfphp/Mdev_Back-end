package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;

public interface EtudiantBusiness {

	// fonction de creation de l'objet etudiant
	
	public Etudiant CreateEtudiant(Etudiant etud) ;
	

 // fonction de suppression de l'objet etudiant selon son ID
	
	public void deleteEtudiant(String NO_ETUDIANT);

 // fonction qui retourne une liste des etudiants selon une promotion donnee 
	
	public List<Etudiant> GetEtudiantPromotions(Promotion p);

// fonction qui retourne une liste de tous les etudiants

	public List<Etudiant> GetAllEtudiants();

}
