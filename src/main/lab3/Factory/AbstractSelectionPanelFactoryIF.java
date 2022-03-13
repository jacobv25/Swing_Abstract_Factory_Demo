package main.lab3.Factory;

import main.lab3.SelectionPanel.SelectionPanel_IF;
import main.lab3.mvc.controller.DifficultyMode;

public interface AbstractSelectionPanelFactoryIF {
    SelectionPanel_IF createSelectionPanel(DifficultyMode mode);
}
