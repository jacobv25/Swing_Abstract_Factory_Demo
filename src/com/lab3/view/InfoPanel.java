package com.lab3.view;

import javax.swing.*;

public class InfoPanel extends JPanel {

    private JLabel info;

    public InfoPanel() {
        info = new JLabel("Choose your mode!");
        add(info);
        setVisible(true);
    }
}
