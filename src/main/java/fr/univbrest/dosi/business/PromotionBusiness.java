package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;

public interface PromotionBusiness {

	// fonction qui retourne la listes des promotions
	public List <Promotion> GetAllPromotions();

	// fonction qui retourne une promotion par id
	public Promotion recupererPromotionParID(PromotionPK promotionPK);
	
}
