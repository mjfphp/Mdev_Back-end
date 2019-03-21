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
	
	// fonction qui ajoute une formation
	@Override
	public Formation AddFormation(Formation formation) {
		return formationRepository.save(formation);
	}

	// fonction qui retourne toutes les formations
	@Override
	public List<Formation> GetAllFormations() {
		List<Formation> formations = (List<Formation>) formationRepository.findAll();
		return formations;
	}

	// fonction qui cherche une formation par id
	@Override
	public Formation SearchFormationById(String CodeFormation) {
		return this.formationRepository.findOne(CodeFormation);
	}

	// fonction qui retourne les promotions d'une formation
	@Override
	public List<Promotion> PromotionByFormation(String CodeFormation) {
		return this.promotionRepository.findAllPromotionByCodeFormation(CodeFormation);
	}

	
}
