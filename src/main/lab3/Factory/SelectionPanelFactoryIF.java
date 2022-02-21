package main.lab3.Factory;

import main.lab3.SelectionPanel.SelectionPanelF;
import main.lab3.main.DifficultyMode;

public interface SelectionPanelFactoryIF {
    SelectionPanelF createCharacterSelectionPanel(DifficultyMode mode);
    SelectionPanelF createWeaponSelectionPanel(DifficultyMode mode);
}
