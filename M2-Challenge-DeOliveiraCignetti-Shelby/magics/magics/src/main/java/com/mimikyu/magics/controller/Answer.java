package com.mimikyu.magics.controller;

import com.mimikyu.magics.models.Answer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
class AnswerController {
    Random random = new Random();
    private static int idCounter = 1;

    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            new Answer(1, "", "It is certain."),
            new Answer(2, "", "Ask again later."),
            new Answer(3, "", "Better not tell you now."),
            new Answer(4, "", "Yes, definitely."),
            new Answer(5, "", "My sources say no."),
            new Answer(6, "", "As I see it, yes."),
            new Answer(7, "", "Most likely."),
            new Answer(8, "", "Don't count on it.")
    ));

    @RequestMapping(value = "/answer", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer askMagicEightBall(@RequestBody String question) {
        int randomAnswerIndex = random.nextInt(answerList.size());
        answerList.get(randomAnswerIndex).setQuestion(question);
        return answerList.get(randomAnswerIndex);
    }
}
