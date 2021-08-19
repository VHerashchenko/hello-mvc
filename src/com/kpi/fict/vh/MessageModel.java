package com.kpi.fict.vh;

public class MessageModel {
    private String firstInputValue;
    private String secondInputValue;
    private String finalMessage;

    private static final String firstNeededWord = "Hello";
    private static final String secondNeededWord = "world!";

    public String getFirstNeededWord() {
        return firstNeededWord;
    }

    public String getSecondNeededWord(){
        return secondNeededWord;
    }

    public void setFirstInputValue(String firstInputValue) {
        this.firstInputValue = firstInputValue;
    }

    public void setSecondInputValue(String secondInputValue) {
        this.secondInputValue = secondInputValue;
    }

    public String getFinalMessage() {
        return finalMessage;
    }

    public void createFinalMessage(){
        finalMessage = firstInputValue + " " + secondInputValue;
    }
}
