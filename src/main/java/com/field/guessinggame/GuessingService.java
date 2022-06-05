package com.field.guessinggame;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class GuessingService {

    private static Logger logger = Logger.getLogger("Field.guessing");
    private static List<GuessingResult> results = new ArrayList<GuessingResult>(10);
    public List<GuessingResult> getAllResult() {
        logger.info("inside Service.getAllResult()");
        return results;
    }
    public void saveOrUpdate(GuessingResult result) {
        results.add(result);
    }
    //public List<GuessingResult> getLeaderboard(){

    // return results;
    // }


}