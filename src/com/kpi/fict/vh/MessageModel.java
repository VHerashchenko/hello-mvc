package com.kpi.fict.vh;

public class MessageModel {
    private String firstInputValue;
    private String secondInputValue;
    private String finalMessage;

    public String getFirstInputValue(){
        return firstInputValue;
    }

    public String getSecondInputValue(){
        return secondInputValue;
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

    public void setFinalMessage(String finalMessage) {
        this.finalMessage = finalMessage;
    }
}
