package com.kpi.fict.vh;

public class Main {

    public static void main(String[] args) {
        MessageModel model = new MessageModel();
        View view = new View();
        MessageController controller = new MessageController(model, view);

        controller.processUser();
    }
}
