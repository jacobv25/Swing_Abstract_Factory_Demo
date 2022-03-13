package main.lab3.Factory;

import main.lab3.SelectionPanel.CharacterSelectionPanel;
import main.lab3.SelectionPanel.SelectionPanel_IF;
import main.lab3.mvc.controller.DifficultyMode;

public class CharacterSelectionPanelFactory implements AbstractSelectionPanelFactoryIF{
    @Override
    public SelectionPanel_IF createSelectionPanel(DifficultyMode mode) {
        return new CharacterSelectionPanel(mode);
    }
}
