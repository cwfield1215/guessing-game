package com.field.guessinggame;

public class GuessingResult implements Comparable<GuessingResult> {
    private String name;
    private int numGuesses;

    public GuessingResult(String name, int numGuesses) {
        this.name = name;
        this.numGuesses = numGuesses;
    }

    public GuessingResult() {

    }

    public String getName() {
        return name;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumGuesses(int numGuesses) {
        this.numGuesses = numGuesses;
    }

    @Override
    public String toString() {
        return "GuessingResult{" +
                "name='" + name + '\'' +
                ", numGuesses=" + numGuesses +
                '}';
    }
    @Override
    public int compareTo(GuessingResult b){
        if(this.numGuesses>b.numGuesses){
            return 1;
        }else if(this.numGuesses<b.numGuesses){
            return -1;
        }else{
            return 0;
        }
    }
}
