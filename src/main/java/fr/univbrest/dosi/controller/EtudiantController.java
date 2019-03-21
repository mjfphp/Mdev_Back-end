package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.business.EtudiantBusiness;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

	// Declaration de notre Etudiantbusiness
	
	private EtudiantBusiness business;

	// Faire la laison entre notre controller et le Etudiantbusiness
	
	@Autowired
	public EtudiantController(EtudiantBusiness business) {
		this.business = business;
	}

	// L'ajout d'un objet etudiant .
	
	@RequestMapping(method = RequestMethod.POST)
	public Etudiant CreateEtudiant(@RequestBody Etudiant etud) {

		return business.CreateEtudiant(etud);
	}

	// Affichage de tous  etudiants 
	
	@RequestMapping(method = RequestMethod.GET)

	public List<Etudiant> GetAllEtudiants() {

		return business.GetAllEtudiants();

	}

	// Affichage de l'etudiant selon son ID
	
	@RequestMapping(method = RequestMethod.GET , value="/{NO_ETUDIANT}" )
        public void deleteEtudiant (@PathVariable("NO_ETUDIANT") String CNE ) {
        	
        	this.business.deleteEtudiant(CNE);
        }
	
	// Affichage des etudiants de la promotion donnee : code formation et annee universitaire
	
	@RequestMapping(method = RequestMethod.GET , value="/promotion/{code_formation}/{annee_univ}" )
	 public List<Etudiant> GetEtudiantPromotions (@PathVariable("code_formation") String CF,@PathVariable("annee_univ") String AU ) {
    	Promotion p = new Promotion();
    	PromotionPK pk = new PromotionPK();
    	pk.setAnneeUniversitaire(AU);
    	pk.setCodeFormation(CF);
    	p.setId(pk);
    	
		return this.business.GetEtudiantPromotions(p);
    }

}
