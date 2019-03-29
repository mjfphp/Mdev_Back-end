package fr.univbrest.dosi.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repository.QuestionRepository;

public class QuestionRepositoryList implements QuestionRepository {

	
	private List<Question> questions;
	
	public QuestionRepositoryList() {
		questions = new ArrayList<>();
	}
	
	@Override
	public <S extends Question> S save(S entity) {
		this.questions.add(entity);
		return entity;
	}

	@Override
	public <S extends Question> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question findOne(Long id) {
		for (Question question : questions)
            if (question.getIdQuestion().equals(id))
                return question;
		 return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Question> findAll() {
		return questions;
	}

	@Override
	public Iterable<Question> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return questions.size();
	}

	@Override
	public void delete(Long id) {
		Question question = this.findOne(id);
		this.questions.remove(question);
	}

	@Override
	public void delete(Question entity) {
		this.questions.remove(entity);
	}

	@Override
	public void delete(Iterable<? extends Question> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> findByIntitule(String intitule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> findIfIdQuestionExistsInReponse(Long idQuestion) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void CreateQuestion(String type, int idenseignant, Integer idqualif, String intitule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateQuestionById(Long idQuestion, Integer idqualif, String intitule) {
		// TODO Auto-generated method stub
		
	}

}
