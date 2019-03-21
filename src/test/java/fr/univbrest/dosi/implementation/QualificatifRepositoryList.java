package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.repository.QualificatifRepository;

public class QualificatifRepositoryList implements QualificatifRepository {

	
	private List<Qualificatif> qualificatifs;
	
	
	public QualificatifRepositoryList() {
		qualificatifs = new ArrayList<>();
	}

	@Override
	public <S extends Qualificatif> S save(S entity) {
		// TODO Auto-generated method stub
		this.qualificatifs.add(entity);
		return entity;
	}

	@Override
	public <S extends Qualificatif> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qualificatif findOne(Integer id) {
		// TODO Auto-generated method stub
		for(Qualificatif qualificatif : qualificatifs) {
			 if (qualificatif.getIdQualificatif().equals(id)) {
                 return qualificatif;
			 }
		}
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
	
		return !(this.findOne(id).equals(null));
	}

	@Override
	public Iterable<Qualificatif> findAll() {
		// TODO Auto-generated method stub
		return this.qualificatifs;
	}

	@Override
	public Iterable<Qualificatif> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return this.qualificatifs.size();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Qualificatif qualificatif = this.findOne(id);
		this.qualificatifs.remove(qualificatif);

	}

	@Override
	public void delete(Qualificatif entity) {
		// TODO Auto-generated method stub

		this.qualificatifs.remove(entity);
	}

	@Override
	public void delete(Iterable<? extends Qualificatif> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Qualificatif> findByMaximal(String maximal) {
		// TODO Auto-generated method stub
		List<Qualificatif> resultats= new ArrayList<>();
		for(Qualificatif qualificatif : qualificatifs)
			 if (qualificatif.getMaximal().equals(maximal))
                resultats.add(qualificatif);
		return resultats;
	}

	@Override
	public List<Qualificatif> findByMinimal(String minimal) {
		// TODO Auto-generated method stub
		List<Qualificatif> resultats= new ArrayList<>();
		for(Qualificatif qualificatif : qualificatifs)
			 if (qualificatif.getMinimal().equals(minimal))
                resultats.add(qualificatif);
		return resultats;
		
	}

	@Override
	public List<Qualificatif> findIfIdQualificatifExistsInReponse(int idQualificatif) {
		// TODO Auto-generated method stub
		return null;
	}

}
