package be.brf.poo;

import be.brf.poo.ui.IUi;
import be.brf.poo.ui.UiConsole;

public class App {
    public static void main(String[] args) {
        IUi ui = new UiConsole();
        
        ui.run();

    }
}