package com.lab3.Factory;

import com.lab3.SelectionPanel.CharacterSelectionPanel;
import com.lab3.SelectionPanel.SelectionPanelF;
import com.lab3.SelectionPanel.WeaponSelectionPanel;
import com.lab3.main.DifficultyMode;

public class SelectionPanelFactory implements SelectionPanelFactoryIF{

    @Override
    public SelectionPanelF createCharacterSelectionPanel(DifficultyMode mode) {
        return new CharacterSelectionPanel(mode);
    }

    @Override
    public SelectionPanelF createWeaponSelectionPanel(DifficultyMode mode) {

        return new WeaponSelectionPanel(mode);
    }
}
