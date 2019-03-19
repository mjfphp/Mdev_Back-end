package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.CgRefCode;
import fr.univbrest.dosi.business.CgRefCodeBusiness;

@RestController
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
	

	@RequestMapping(method = RequestMethod.GET , value="/{domain}" )
        public List<CgRefCode> FindByDomain (@PathVariable("domain") String domain ) {
        	
        	return this.business.FindByDomain(domain);
        }

}
