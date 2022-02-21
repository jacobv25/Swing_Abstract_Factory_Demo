package main.lab3.view;

import main.lab3.events.DifficultyModeActionListener;
import main.lab3.main.DifficultyMode;

import javax.swing.*;
import java.awt.*;

public class ModeButtonPanel extends JPanel {
    private JButton begButton;
    private JButton intButton;
    private JButton advButton;
    private CustomFrame parentCustomFrame;

    public ModeButtonPanel(CustomFrame customFrame) {
        parentCustomFrame = customFrame;
        begButton = new JButton("Beginner");
        intButton = new JButton("Intermediate");
        advButton = new JButton("Advance");
        setButtonActionListeners();
        setLayout(new FlowLayout());
        add(begButton);
        add(intButton);
        add(advButton);
        setVisible(true);
    }

    private void setButtonActionListeners() {
        begButton.addActionListener(new DifficultyModeActionListener(DifficultyMode.BEGINNER, parentCustomFrame));
        intButton.addActionListener(new DifficultyModeActionListener(DifficultyMode.INTERMEDIATE, parentCustomFrame));
        advButton.addActionListener(new DifficultyModeActionListener(DifficultyMode.ADVANCE, parentCustomFrame));
    }

}
