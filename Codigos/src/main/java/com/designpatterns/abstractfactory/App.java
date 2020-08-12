package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.client.Button;
import com.designpatterns.abstractfactory.factory.ControlFactory;
import com.designpatterns.abstractfactory.factory.GateControlFactory;
import com.designpatterns.abstractfactory.factory.TVControlFactory;
import com.designpatterns.abstractfactory.factory.VideoGameControlFactory;

public class App {

    public static Button usingControl() {

        Button button;
        ControlFactory prototype;

        String buttonType = System.getProperty("key", "tv");

        if (buttonType.equals("videogame")) {
            prototype = new VideoGameControlFactory();
            button = new Button(prototype);
        } else if (buttonType.equals("tv")) {
            prototype = new TVControlFactory();
            button = new Button(prototype);
        } else {
            prototype = new GateControlFactory();
            button = new Button(prototype);
        }
        return button;
    }

    public static void main(String[] args) {
        Button button = usingControl();
        button.pressButton();
    }
}
