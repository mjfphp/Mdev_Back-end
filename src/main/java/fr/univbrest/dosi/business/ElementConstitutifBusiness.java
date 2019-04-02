package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.repository.ElementConstitutifRepository;

public interface ElementConstitutifBusiness  {
	
	List<ElementConstitutif> GetAllElementConstitutifForEnseignantCodeUEAndCodeFormation(Integer  noEnseignant, String codeFormation, String codeUE );


}
