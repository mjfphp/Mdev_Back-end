package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repository.QualificatifRepository;

@Service
public class QualificatifBusinessJPA implements QualificatifBusiness {

	QualificatifRepository qualificatifRepository;

	@Autowired
	public QualificatifBusinessJPA(QualificatifRepository repos) {
		this.qualificatifRepository = repos;
	}

	// fonction qui ajoute un qualificatif
	@Override
	public Qualificatif createQualificatif(Qualificatif qual) {
		return qualificatifRepository.save(qual);
	}

	// fonction qui cherche tous les qualificatifs
	@Override
	public List<Qualificatif> GetAllQualificatifs() {
		// TODO Auto-generated method stub
		return (List<Qualificatif>) qualificatifRepository.findAll();
	}
	
	// fonction qui supprime un qualificatif
	@Override
	public void deleteQualificatif(Integer idQualificatif) {
		qualificatifRepository.delete(idQualificatif);
	}

	// fonction qui cherche un qualificatif par id
	@Override
	public Qualificatif findQualificationById(Integer idQualificatif) {
		return qualificatifRepository.findOne(idQualificatif);
	}

	// fonction qui modifie un qualificatif
	@Override
	public Qualificatif updateQualificatifById(Qualificatif qualificatif) {
		Qualificatif rs = this.qualificatifRepository.findOne(qualificatif.getIdQualificatif());
		rs.setMaximal(qualificatif.getMaximal());
		rs.setMinimal(qualificatif.getMinimal());
		this.qualificatifRepository.save(rs);
		return rs;
	}

	// fonction qui cherche un qualificatif par min
	@Override
	public List<Qualificatif> findQualificationByMin(String minimal) {
		return (List<Qualificatif>) this.qualificatifRepository.findByMinimal(minimal);
	}

	// fonction qui cherche un qualificatif par max
	@Override
	public List<Qualificatif> findQualificationByMax(String maximal) {
		return (List<Qualificatif>) this.qualificatifRepository.findByMaximal(maximal);
	}

	// fonction qui cherche un qualificatif par min
	@Override
	public boolean findIfIdQualificatifExistsInReponse(Integer idQualificatif) {
		return qualificatifRepository.findIfIdQualificatifExistsInReponse(idQualificatif).isEmpty();
	}

}
