package com.kodoma;


import com.kodoma.controller.Controller;
import com.kodoma.view.View;

/**
 * Created by Кодома on 26.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller();
        view.setController(controller);
        controller.setObserver(view);

        view.select();
    }
}
