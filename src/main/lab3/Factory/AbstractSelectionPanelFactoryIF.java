package main.lab3.Factory;

import main.lab3.SelectionPanel.SelectionPanel_IF;
import main.lab3.main.DifficultyMode;

public interface AbstractSelectionPanelFactoryIF {
    SelectionPanel_IF createSelectionPanel(DifficultyMode mode);
}
