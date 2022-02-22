package main.lab3.Factory;

import main.lab3.SelectionPanel.CharacterSelectionPanel;
import main.lab3.SelectionPanel.SelectionPanel_IF;
import main.lab3.SelectionPanel.WeaponSelectionPanel;
import main.lab3.main.DifficultyMode;

public class SelectionPanelFactory implements SelectionPanelFactoryIF{

    @Override
    public SelectionPanel_IF createCharacterSelectionPanel(DifficultyMode mode) {
        return new CharacterSelectionPanel(mode);
    }

    @Override
    public SelectionPanel_IF createWeaponSelectionPanel(DifficultyMode mode) {

        return new WeaponSelectionPanel(mode);
    }
}
