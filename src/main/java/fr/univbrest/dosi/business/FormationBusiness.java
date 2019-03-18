package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;

public interface FormationBusiness {
	List<Formation> GetAllFormations();
	Formation SearchFormationById(String idFormation);
	Formation AddFormation(Formation formation);
	List<Promotion> PromotionByFormation(String idFormation);
}
