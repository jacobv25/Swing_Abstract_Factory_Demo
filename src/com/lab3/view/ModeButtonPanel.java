package com.lab3.view;

import javax.swing.*;
import java.awt.*;

public class ModeButtonPanel extends JPanel {
    private JButton begButton;
    private JButton intButton;
    private JButton advButton;

    public ModeButtonPanel() {
        begButton = new JButton("Beginner");
        intButton = new JButton("Intermediate");
        advButton = new JButton("Advance");
        setLayout(new FlowLayout());
        add(begButton);
        add(intButton);
        add(advButton);
        setVisible(true);
    }
}
