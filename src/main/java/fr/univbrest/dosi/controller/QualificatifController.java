package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.business.QualificatifBusiness;

@RestController
@RequestMapping("/qualificatifs")
public class QualificatifController {

	private QualificatifBusiness business;

	@Autowired
	public QualificatifController(QualificatifBusiness business) {
		this.business = business;
	}

	// fonction qui retourne tous les qualificatifs
	@RequestMapping(method = RequestMethod.GET)
	public List<Qualificatif> getAllQualificatifs() {
		return business.GetAllQualificatifs();
	}

	// fonction qui cherche un qualificatif par id
	@RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
	public Qualificatif getQualificatifById(@PathVariable("id") Integer idQualificatif) {
		return business.findQualificationById(idQualificatif);
	}

	// fonction qui cherche un qualificatif par max
	@RequestMapping(method = RequestMethod.GET, value = "/max/{max}")
	public List<Qualificatif> getQualificatifByMax(@PathVariable("max") String max) {
		return business.findQualificationByMax(max);
	}

	// fonction qui cherche un qualificatif par min
	@RequestMapping(method = RequestMethod.GET, value = "/min/{min}")
	public List<Qualificatif> getQualificatifByMin(@PathVariable("min") String min) {
		return business.findQualificationByMin(min);
	}

	// fonction qui crée un qualificatif  
	@RequestMapping(method = RequestMethod.POST)
	public Qualificatif createQualificatif(@RequestBody Qualificatif qualificatif) {
		return business.createQualificatif(qualificatif);

	}

	// fonction qui modifie un qualificatif 
	@RequestMapping(method = RequestMethod.PUT)
	public Qualificatif updateQualificatif(@RequestBody Qualificatif qualificatif) {

		return business.updateQualificatifById(qualificatif);
	}

	// fonction qui supprime un qualificatif
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteQualificatifById(@RequestBody Qualificatif qualificatif) {

		if (!business.findIfIdQualificatifExistsInReponse(qualificatif.getIdQualificatif())) {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("Contenu", "Le Qualificatif est utilisé dans la reponse d'une question");
			business.deleteQualificatif(qualificatif.getIdQualificatif());
			return (ResponseEntity<?>) ResponseEntity.ok().headers(responseHeaders).build();
		} else {
			business.deleteQualificatif(qualificatif.getIdQualificatif());
			return ResponseEntity.ok().build();
		}

	}

}
