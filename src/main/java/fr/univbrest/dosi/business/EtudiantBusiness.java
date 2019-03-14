package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;

public interface EtudiantBusiness {

	public Etudiant CreateEtudiant(Etudiant etud) ;
	

 
	void deleteEtudiant(String NO_ETUDIANT);


	List<Etudiant> GetEtudiantPromotions(Promotion p);



	List<Etudiant> GetAllEtudiants();

}
