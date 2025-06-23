package com.example.questionservice.Controller;

import com.example.questionservice.Models.Questions;
import com.example.questionservice.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/all")
    public List<Questions> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Questions getQuestionById(@PathVariable int id) {
        return questionService.getQuestionById(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Questions> getQuizQuestionById(@PathVariable int id) {
        return questionService.getQuizQuestionById(id);
    }

    @PostMapping("/create")
    public Questions createQuestion(@RequestBody Questions question) {
        return questionService.saveQuestion(question);
    }

}
