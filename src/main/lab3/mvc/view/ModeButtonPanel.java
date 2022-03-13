package main.lab3.mvc.view;

import main.lab3.events.DifficultyModeActionListener;
import main.lab3.mvc.controller.DifficultyMode;
import main.lab3.mvc.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ModeButtonPanel extends JPanel {
    private JButton begButton;
    private JButton intButton;
    private JButton advButton;
    private Controller controller;

    public ModeButtonPanel(Controller controller) {
        this.controller = controller;
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
        begButton.addActionListener(new DifficultyModeActionListener(DifficultyMode.BEGINNER, controller));
        intButton.addActionListener(new DifficultyModeActionListener(DifficultyMode.INTERMEDIATE, controller));
        advButton.addActionListener(new DifficultyModeActionListener(DifficultyMode.ADVANCE, controller));
    }

}
