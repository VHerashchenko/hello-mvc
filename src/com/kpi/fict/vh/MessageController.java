package com.kpi.fict.vh;

import java.util.Scanner;

public class MessageController {

    private final MessageModel messageModel;
    private final View view;

    public MessageController(MessageModel messageModel, View view) {
        this.messageModel = messageModel;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);

        messageModel.setFirstInputValue(
                stringValidScanner(scanner, messageModel.getFirstNeededWord(), View.WRONG_FIRST_INPUT_DATA));

        messageModel.setSecondInputValue(
                stringValidScanner(scanner, messageModel.getSecondNeededWord(), View.WRONG_SECOND_INPUT_DATA));

        messageModel.createFinalMessage();

        view.printMessage(messageModel.getFinalMessage());

    }

    private String stringValidScanner(Scanner scanner, String neededMessage, String errorMessage){
        boolean cycle = true;
        String message = "";

        while (cycle) {
            view.printMessage(View.INPUT_STRING);
            message = scanner.nextLine();

            if (message.equals(neededMessage)) {
                cycle = false;
            }
            else {
                view.printMessage(errorMessage);
            }
        }

        return message;
    }

}
