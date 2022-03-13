package main.lab3.Factory;

import main.lab3.SelectionPanel.SelectionPanel_IF;
import main.lab3.mvc.controller.DifficultyMode;

public interface SelectionPanelFactoryIF {
    SelectionPanel_IF createCharacterSelectionPanel(DifficultyMode mode);
    SelectionPanel_IF createWeaponSelectionPanel(DifficultyMode mode);
}
