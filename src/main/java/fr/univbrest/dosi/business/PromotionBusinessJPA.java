package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.repository.PromotionRepository;

@Service
public class PromotionBusinessJPA implements PromotionBusiness {

	PromotionRepository promotionRepository;

	public PromotionBusinessJPA(PromotionRepository repos) {
		this.promotionRepository = repos;
	}
	
	
	@Override
	public List<Promotion> GetAllPromotions() {
		// TODO Auto-generated method stub
		return  (List<Promotion>) promotionRepository.findAll();
	}

}
