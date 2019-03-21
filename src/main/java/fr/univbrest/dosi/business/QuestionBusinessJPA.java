package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repository.QualificatifRepository;
import fr.univbrest.dosi.repository.QuestionRepository;

@Service
public class QuestionBusinessJPA implements QuestionBusiness {

	QuestionRepository questionRepository;

	QualificatifRepository qualificatifRepository;

	@Autowired
	public QuestionBusinessJPA(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> GetAllQuestions() {
		// TODO Auto-generated method stub
		return (List<Question>) questionRepository.findAll();
	}

	@Override
	public void deleteQuestion(Long idQuestion) {
		questionRepository.delete(idQuestion);

	}

	@Override
	public Question createQuestion(Question question) {
		// TODO Auto-generated method stub
		Question q = new Question(question.getIdQuestion(), question.getIntitule(), question.getType(),
				question.getEnseignant(), question.getQualificatif());
		return questionRepository.save(q);
	}

	@Override
	public Question findQuestionById(Long idQuestion) {
		// TODO Auto-generated method stub
		return questionRepository.findOne(idQuestion);
	}

	@Override
	public List<Question> findQuestionByIntitule(String intitule) {
		// TODO Auto-generated method stub
		return questionRepository.findByIntitule(intitule);
	}

	@Override
	public List<Question> findQuestionByType(String type) {
		// TODO Auto-generated method stub
		return questionRepository.findByType(type);
	}

	@Override
	public boolean findIfIdQuestionExistsInReponse(Long idQuestion) {
		// TODO Auto-generated method stub
		return questionRepository.findIfIdQuestionExistsInReponse(idQuestion).isEmpty();
	}

	@Override
	public Question updateQuestionById(Question question) {
		// TODO Auto-generated method stub
		questionRepository.UpdateQuestionById(question.getIdQuestion(), question.getType(), question.getEnseignant().getNoEnseignant(),
				question.getQualificatif().getIdQualificatif(), question.getIntitule());

		return question;
	}

}
