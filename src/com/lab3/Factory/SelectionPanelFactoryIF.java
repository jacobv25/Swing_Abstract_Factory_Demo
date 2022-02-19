package com.lab3.Factory;

import com.lab3.SelectionPanel.SelectionPanelF;
import com.lab3.main.DifficultyMode;

public interface SelectionPanelFactoryIF {
    SelectionPanelF createCharacterSelectionPanel(DifficultyMode mode);
    SelectionPanelF createWeaponSelectionPanel(DifficultyMode mode);
}
