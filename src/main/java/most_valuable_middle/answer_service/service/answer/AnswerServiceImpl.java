package most_valuable_middle.answer_service.service.answer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import most_valuable_middle.answer_service.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService {
    private final QuestionRepository questionRepository;

    @Override
    public String getAnswerByQuestionId(int questionId) {
        return questionRepository.findById(questionId).get().getAnswer();
    }
}
