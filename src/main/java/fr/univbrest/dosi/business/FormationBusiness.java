package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;

public interface FormationBusiness {
	
	// fonction qui retourne toutes les formations
	List<Formation> GetAllFormations();
	
	// fonction qui cherche une formation par id
	Formation SearchFormationById(String idFormation);
	
	// fonction qui retourne les promotions d'une formation
	List<Promotion> PromotionByFormation(String idFormation);
	
	// fonction qui ajoute une formation
	Formation AddFormation(Formation formation);
}