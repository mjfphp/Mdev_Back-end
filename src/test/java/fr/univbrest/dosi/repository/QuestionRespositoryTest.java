package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.business.QuestionBusinessJPA;
import fr.univbrest.dosi.implementation.QuestionRepositoryList;

@RunWith(SpringJUnit4ClassRunner.class)
public class QuestionRespositoryTest {
	QuestionBusinessJPA questionBusinessJPA;
	
	QuestionRepository questionRepository = new QuestionRepositoryList();
	
	Qualificatif qual1 = new Qualificatif(1,"Bien","Mauvais");
	Qualificatif qual2 = new Qualificatif(1,"Fort","Faible");

	Enseignant e1 = new Enseignant(1,"ens1","ens11");
	
	Question q1 = new Question((long)1,"niveau cours","QS",e1,qual1);
	Question q2 = new Question((long)2,"niveau td","QS",e1,qual2);
	
	@Test
	public void TestAjoutQuestion() {
		QuestionRepository questionRepository = new QuestionRepositoryList();
		questionRepository.save(q1);
		assertThat(questionRepository.count()).isEqualTo(1);
	}
	
	@Test
	public void TestListQuestion() {
		QuestionRepository questionRepository = new QuestionRepositoryList();
		questionRepository.save(q1);
		questionRepository.save(q2);
		assertThat(questionRepository.count()).isEqualTo(2);
	}
	
	@Test
	public void TestSupprimerQuestion() {
		QuestionRepository questionRepository = new QuestionRepositoryList();
		questionRepository.save(q1);
		questionRepository.save(q2);
		questionRepository.delete(q1.getIdQuestion());
		questionRepository.delete(q2.getIdQuestion());
		assertThat(questionRepository.count()).isEqualTo(0);
	}
	
}
