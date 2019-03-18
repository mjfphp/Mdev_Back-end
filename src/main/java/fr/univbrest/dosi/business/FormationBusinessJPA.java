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
	/*
	@Autowired
	private EntityManager em;*/
	
	@Autowired
	private FormationRepository formationRepository;

	@Autowired
	private PromotionRepository promotionRepository;
	
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
	public Formation SearchFormationById(String idFormation) {
		return this.formationRepository.findOne(idFormation);
	}

	@Override
	public List<Promotion> PromotionByFormation(String idFormation) {
		return this.promotionRepository.findAllPromotionByCodeFormation(idFormation);
	}

	
}
