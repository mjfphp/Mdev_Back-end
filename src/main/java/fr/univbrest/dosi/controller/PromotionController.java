package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.business.PromotionBusiness;

@RestController
@RequestMapping("/promotions")

public class PromotionController {

	private PromotionBusiness business;

	@Autowired
	public PromotionController(PromotionBusiness business) {
		this.business = business;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Promotion> GetAllPromotions(){
		return business.GetAllPromotions();
	}
	
	
}
