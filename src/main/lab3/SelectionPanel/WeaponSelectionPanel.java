package main.lab3.SelectionPanel;

import main.lab3.mvc.controller.DifficultyMode;
import main.lab3.mvc.model.ImagePanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WeaponSelectionPanel extends JPanel implements SelectionPanel_IF{

    private DifficultyMode mode;

    public WeaponSelectionPanel(DifficultyMode mode) {
        this.mode = mode;
    }

    @Override
    public void paint() {
        this.setVisible(true);
    }

    @Override
    public void erase() {
        this.setVisible(false);
    }

    @Override
    public void addPanel(ImagePanel imagePanel) {
        add(imagePanel);
    }

    public DifficultyMode getMode() {
        return mode;
    }
}
