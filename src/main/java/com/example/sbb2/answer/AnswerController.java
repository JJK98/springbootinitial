package com.example.sbb2.answer;

import com.example.sbb2.question.Question;
import com.example.sbb2.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;
    @PostMapping("/answer/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam(value = "content") String content){
        Question question = this.questionService.getQuestion(id);

        this.answerService.create(question, content);

        return String.format("redirect:/question/detail/%s", id);

    }
}
