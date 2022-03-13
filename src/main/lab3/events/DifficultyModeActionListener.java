package main.lab3.events;

import main.lab3.mvc.controller.DifficultyMode;
import main.lab3.mvc.controller.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyModeActionListener implements ActionListener {

    private DifficultyMode discriminator;
    private Controller controller;

    public DifficultyModeActionListener(DifficultyMode discriminator, Controller controller) {
        this.discriminator = discriminator;
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (discriminator) {
            case BEGINNER:
                controller.beginnerButtonPushed();
                    break;
            case INTERMEDIATE:
                controller.intermediateButtonPushed();
                    break;
            case ADVANCE:
                controller.advanceButtonPushed();
                    break;
        }
    }
}
