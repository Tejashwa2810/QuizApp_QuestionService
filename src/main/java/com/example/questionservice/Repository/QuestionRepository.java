package com.example.questionservice.Repository;

import com.example.questionservice.Models.Questions;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Integer> {
    List<Questions> findByQuizId(int quizId);

    List<Questions> id(int id);
}
