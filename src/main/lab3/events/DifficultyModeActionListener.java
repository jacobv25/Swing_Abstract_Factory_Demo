package main.lab3.events;

import main.lab3.main.DifficultyMode;
import main.lab3.view.CustomFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyModeActionListener implements ActionListener {

    private DifficultyMode discriminator;
    private CustomFrame customFrame;

    public DifficultyModeActionListener(DifficultyMode discriminator, CustomFrame customFrame) {
        this.discriminator = discriminator;
        this.customFrame = customFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (discriminator) {
            case BEGINNER:
                    customFrame.beginnerButtonPushed();
                    break;
            case INTERMEDIATE:
                    customFrame.intermediateButtonPushed();
                    break;
            case ADVANCE:
                    customFrame.advanceButtonPushed();
                    break;
        }
    }
}
