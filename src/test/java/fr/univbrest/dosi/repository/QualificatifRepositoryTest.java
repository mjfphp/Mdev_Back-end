package fr.univbrest.dosi.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.implementation.QualificatifRepositoryList;

public class QualificatifRepositoryTest {

	QualificatifRepository qualificatifRepository = new QualificatifRepositoryList();

	Qualificatif q1 = new Qualificatif(1, "Fort", "Faible");

	@Test
	public void GetAllQualificatifs() {
		QualificatifRepositoryList qualificatifRepository = new QualificatifRepositoryList();
		qualificatifRepository.save(q1);
		assertEquals(qualificatifRepository.count(), 1);
	}

	@Test
	public void deleteQualificatif() {
		QualificatifRepositoryList qualificatifRepository = new QualificatifRepositoryList();
		qualificatifRepository.save(q1);
		assertEquals(qualificatifRepository.count(), 1);
		qualificatifRepository.delete(q1.getIdQualificatif());
		Qualificatif b = qualificatifRepository.findOne(q1.getIdQualificatif());
		assertNull(b);

	}

	@Test
	public void createQualificatif() {
		
		QualificatifRepositoryList qualificatifRepository = new QualificatifRepositoryList();
		qualificatifRepository.save(q1);
		assertEquals(qualificatifRepository.count(), 1);
		
	}


}
