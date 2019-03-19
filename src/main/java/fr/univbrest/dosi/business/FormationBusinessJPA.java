package fr.univbrest.dosi.business;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.repository.FormationRepository;
import fr.univbrest.dosi.repository.PromotionRepository;

@Service
public class FormationBusinessJPA implements FormationBusiness{
	
	private FormationRepository formationRepository;
	private PromotionRepository promotionRepository;
	
	@Autowired
	public FormationBusinessJPA(FormationRepository formationRepository, PromotionRepository promotionRepository ) {
		this.formationRepository = formationRepository;
		this.promotionRepository = promotionRepository;
	}
	
	@Override
	public Formation AddFormation(Formation formation) {
		return formationRepository.save(formation);
	}

	@Override
	public List<Formation> GetAllFormations() {
		List<Formation> formations = (List<Formation>) formationRepository.findAll();
		return formations;
	}

	@Override
	public Formation SearchFormationById(String CodeFormation) {
		return this.formationRepository.findOne(CodeFormation);
	}

	@Override
	public List<Promotion> PromotionByFormation(String CodeFormation) {
		return this.promotionRepository.findAllPromotionByCodeFormation(CodeFormation);
	}

	
}
