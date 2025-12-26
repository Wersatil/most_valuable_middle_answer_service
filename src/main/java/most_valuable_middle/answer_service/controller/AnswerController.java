package most_valuable_middle.answer_service.controller;

import lombok.RequiredArgsConstructor;
import most_valuable_middle.answer_service.service.answer.AnswerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/answers")
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;

    @GetMapping("/{questionId}")
    public String getAnswerByQuestionId(@PathVariable int questionId) {
        return answerService.getAnswerByQuestionId(questionId);
    }
}
