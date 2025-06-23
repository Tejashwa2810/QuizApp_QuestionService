package com.example.questionservice.Service;

import com.example.questionservice.Models.Questions;
import com.example.questionservice.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Questions> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Questions getQuestionById(int id) {
        return questionRepository.findById(id).get();
    }

    public List<Questions> getQuizQuestionById(int id) {
        return questionRepository.findByQuizId(id);
    }

    public Questions saveQuestion(Questions question) {
        return questionRepository.save(question);
    }
}
