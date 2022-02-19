package com.lab3.view;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    private JPanel container;

    public CustomFrame() {
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel infoPanel = new InfoPanel();
        JPanel modeButtonPanel = new ModeButtonPanel();
        container = new JPanel(new BorderLayout());

        infoPanel.setVisible(true);
        modeButtonPanel.setVisible(true);

        container.add(infoPanel, BorderLayout.NORTH);
        container.add(modeButtonPanel, BorderLayout.CENTER);

        add(container);
    }
}
