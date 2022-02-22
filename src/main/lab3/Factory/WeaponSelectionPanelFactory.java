package main.lab3.Factory;

import main.lab3.SelectionPanel.SelectionPanel_IF;
import main.lab3.SelectionPanel.WeaponSelectionPanel;
import main.lab3.main.DifficultyMode;

public class WeaponSelectionPanelFactory implements AbstractSelectionPanelFactoryIF{
    @Override
    public SelectionPanel_IF createSelectionPanel(DifficultyMode mode) {
        return new WeaponSelectionPanel(mode);
    }
}
