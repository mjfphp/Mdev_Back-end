package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.repository.ElementConstitutifRepository;

@Service
public class ElementConstitutifBusinessJPA implements ElementConstitutifBusiness {

	public ElementConstitutifBusinessJPA(ElementConstitutifRepository repository) {
		this.repository = repository;
	}
	ElementConstitutifRepository repository;
	@Override
	public List<ElementConstitutif> GetAllElementConstitutifForEnseignantCodeUEAndCodeFormation(Integer noEnseignant,
			String codeFormation, String codeUE) {
		return  repository.GetAllElementConstitutifForEnseignantCodeUEAndCodeFormation(noEnseignant, codeFormation, codeUE);
	}


}
