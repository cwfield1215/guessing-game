package com.field.guessinggame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class GuessingController {

    private static Logger logger = Logger.getLogger("Field.guessing");

    @Autowired
    GuessingService resultService;

    @GetMapping("/result")
    private List<GuessingResult> getAllResult(){
        logger.info("Inside Controller.getAllResult()");
        return resultService.getAllResult();
    }

    @PostMapping("/result")
    private String saveResult(@RequestBody GuessingResult result){
        logger.info(result.toString());
        resultService.saveOrUpdate(result);
        return result.getName() + " " + result.getNumGuesses();
    }

    @GetMapping("/leaderboard")
    private List<GuessingResult> leaderboard() {
        logger.info("Inside leaderboard");
        List<GuessingResult> gr = resultService.getAllResult();
        logger.info("past getallresult");
        Collections.sort(gr);
        return gr;
    }
}
