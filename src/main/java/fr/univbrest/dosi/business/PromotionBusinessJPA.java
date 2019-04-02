package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repository.PromotionRepository;

@Service
public class PromotionBusinessJPA implements PromotionBusiness {

	PromotionRepository promotionRepository;

	public PromotionBusinessJPA(PromotionRepository repos) {
		this.promotionRepository = repos;
	}
	
	// fonction qui retourne la listes des promotions
	@Override
	public List<Promotion> GetAllPromotions() {
		return  (List<Promotion>) promotionRepository.findAll();
	}

	// fonction qui retourne une promotion par id
	@Override
	public Promotion recupererPromotionParID(PromotionPK promotionPK) {
		return this.promotionRepository.findOne(promotionPK);
	}
	
}
