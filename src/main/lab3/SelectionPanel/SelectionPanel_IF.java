package main.lab3.SelectionPanel;

import main.lab3.mvc.model.ImagePanel;

public interface SelectionPanel_IF {
    void paint();
    void erase();
    void addPanel(ImagePanel imagePanel);
}