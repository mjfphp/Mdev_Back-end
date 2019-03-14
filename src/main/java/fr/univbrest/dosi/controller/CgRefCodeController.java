package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.CgRefCode;
import fr.univbrest.dosi.business.CgRefCodeBusiness;

@RestController
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)
@RequestMapping("/cgrefcodes")
public class CgRefCodeController {
	CgRefCodeBusiness business;
	@Autowired
	public CgRefCodeController(CgRefCodeBusiness business) {
		this.business = business;
	}
	

	@RequestMapping(method=RequestMethod.GET)
	public List<CgRefCode> GetAllCgRefCodes(){
		return business.GetAllCgRefCodes();
	}

}
