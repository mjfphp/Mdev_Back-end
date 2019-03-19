package fr.univbrest.dosi.business;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repository.QualificatifRepository;

@Service
public class QualificatifBusinessJPA implements QualificatifBusiness {

	
	QualificatifRepository qualificatifRepository ;
	
	@Autowired
	public QualificatifBusinessJPA(QualificatifRepository repos) {
		this.qualificatifRepository=repos;
	}
	
	@Override
	public Qualificatif createQualificatif(Qualificatif qual) {
		// TODO Auto-generated method stub
		return qualificatifRepository.save(qual);
		
	}

	@Override
	public List<Qualificatif> GetAllQualificatifs() {
		// TODO Auto-generated method stub
		return (List<Qualificatif>) qualificatifRepository.findAll();
	}

	@Override
	public void deleteQualificatif(Integer idQualificatif) {
		qualificatifRepository.delete(idQualificatif);
		
	}

	@Override
	public Qualificatif findQualificationById(Integer idQualificatif) {
		// TODO Auto-generated method stub
		return  qualificatifRepository.findOne(idQualificatif);
	}

	@Override
	public Qualificatif updateQualificatifById(Qualificatif qualificatif) {
		// TODO Auto-generated method stub
		Qualificatif rs = this.qualificatifRepository.findOne(qualificatif.getIdQualificatif());
		rs.setMaximal(qualificatif.getMaximal());
		rs.setMinimal(qualificatif.getMinimal());
		this.qualificatifRepository.save(rs);
		return rs;
	}

	@Override
	public List<Qualificatif> findQualificationByMin(String minimal) {
		// TODO Auto-generated method stub
		return (List<Qualificatif>) this.qualificatifRepository.findByMinimal(minimal);
	}

	@Override
	public List<Qualificatif> findQualificationByMax(String maximal) {
		// TODO Auto-generated method stub
		return (List<Qualificatif>) this.qualificatifRepository.findByMaximal(maximal);
	}

	@Override
	public boolean findIfIdQualificatifExistsInReponse(Integer idQualificatif) {
		// TODO Auto-generated method stub
		 
		return	qualificatifRepository.findIfIdQualificatifExistsInReponse(idQualificatif).isEmpty();
			
	}


	
	

}
