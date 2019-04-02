package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.UniteEnseignement;

public interface UniteEnseignementBusiness  {
	
	List<UniteEnseignement> GetAllUniteEnseignementForEnseignantAndCodeFormation(Integer  noEnseignant, String codeFormation);


}
