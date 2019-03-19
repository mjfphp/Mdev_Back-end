package fr.univbrest.dosi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.business.QualificatifBusiness;



@RestController
@CrossOrigin
@RequestMapping("/qualificatifs")
public class QualificatifController {
    
    private QualificatifBusiness business;

    
    @Autowired
    public QualificatifController(QualificatifBusiness business) {
        this.business = business;
    }
    
    // Get All Qualificatifs
    @RequestMapping(method = RequestMethod.GET)
    public List<Qualificatif> getAllQualificatifs() {
        return business.GetAllQualificatifs();
    }
    
    
    // Get Qualificatifs By Id
    @RequestMapping(method = RequestMethod.GET, value="/id/{id}")
    public Qualificatif getQualificatifById(@PathVariable("id") Integer idQualificatif) {
        return business.findQualificationById(idQualificatif);
    }
    
    // Get Qualificatifs By Max
        @RequestMapping(method = RequestMethod.GET, value="/max/{max}")
        public List<Qualificatif> getQualificatifByMax(@PathVariable("max") String max) {
            return business.findQualificationByMax(max);
        }
        
    // Get Qualificatifs By Min
        @RequestMapping(method = RequestMethod.GET, value="/min/{min}")
        public List<Qualificatif> getQualificatifByMin(@PathVariable("min") String min) {
            return business.findQualificationByMin(min);
        }

    // Create a new Qualificatif
    @RequestMapping(method = RequestMethod.POST)
    public Qualificatif createQualificatif(@RequestBody Qualificatif qualificatif) {
        return business.createQualificatif(qualificatif);
    }
    
    // update a Qualificatif
    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    public Qualificatif updateQualificatif(@PathVariable("id") int id,  @RequestBody Qualificatif qualificatif){
        return business.updateQualificatifById(qualificatif);
    }
    
 // Delete a Qualificatif By Id
    @RequestMapping(method = RequestMethod.DELETE, value="/{idQualificatif}")
    public String deleteQualificatifById(@PathVariable(value = "idQualificatif") Integer idQualificatif) {
        
        if (business.findIfIdQualificatifExistsInReponse(idQualificatif)) {
            
            business.deleteQualificatif(idQualificatif);
            return "Le Qualificatif est supprimé";
        }
        else {
            return "Le Qualificatif est utilisé dans la reponse d'une question";
    
        }
        
    }




}
