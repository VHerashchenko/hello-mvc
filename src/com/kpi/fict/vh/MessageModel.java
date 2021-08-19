package com.kpi.fict.vh;

public class MessageModel {
    private String firstInputValue;
    private String secondInputValue;
    private String finalMessage;

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
