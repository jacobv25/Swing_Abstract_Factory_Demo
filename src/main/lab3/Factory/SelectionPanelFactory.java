package main.lab3.Factory;

import main.lab3.SelectionPanel.CharacterSelectionPanel;
import main.lab3.SelectionPanel.SelectionPanelF;
import main.lab3.SelectionPanel.WeaponSelectionPanel;
import main.lab3.main.DifficultyMode;

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
