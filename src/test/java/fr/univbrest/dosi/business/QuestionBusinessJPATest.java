package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import fr.univbrest.dosi.bean.Enseignant;
import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.implementation.QuestionRepositoryList;
import fr.univbrest.dosi.repository.QuestionRepository;

public class QuestionBusinessJPATest {

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
		QuestionBusinessJPA questionBusinessJPA = new QuestionBusinessJPA(questionRepository);
		questionBusinessJPA.createQuestion(q1);
		assertThat(questionRepository.count()).isEqualTo(1);
	}
	
	@Test
	public void TestListQuestion() {
		QuestionRepository questionRepository = new QuestionRepositoryList();
		QuestionBusinessJPA questionBusinessJPA = new QuestionBusinessJPA(questionRepository);
		questionBusinessJPA.createQuestion(q1);
		questionBusinessJPA.createQuestion(q2);
		assertThat(questionRepository.count()).isEqualTo(2);
	}
	
	@Test
	public void TestSupprimerQuestion() {
		QuestionRepository questionRepository = new QuestionRepositoryList();
		QuestionBusinessJPA questionBusinessJPA = new QuestionBusinessJPA(questionRepository);
		questionBusinessJPA.createQuestion(q1);
		questionBusinessJPA.createQuestion(q2);
		questionBusinessJPA.deleteQuestion(q1.getIdQuestion());
		questionBusinessJPA.deleteQuestion(q2.getIdQuestion());
		assertThat(questionRepository.count()).isEqualTo(0);
	}
	
	
}
