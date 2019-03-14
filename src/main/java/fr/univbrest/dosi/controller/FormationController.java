package fr.univbrest.dosi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.business.FormationBusiness;

@RestController
@CrossOrigin
@RequestMapping("/formations")
public class FormationController {

	private FormationBusiness formationBusiness;
}
