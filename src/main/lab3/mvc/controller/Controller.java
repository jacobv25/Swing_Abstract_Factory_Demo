package main.lab3.mvc.controller;

import main.lab3.SelectionPanel.CharacterSelectionPanel;
import main.lab3.SelectionPanel.WeaponSelectionPanel;
import main.lab3.mvc.model.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Controller  {

    private List<CharacterSelectionPanel> charSelPanelList;
    private List<WeaponSelectionPanel> weaponSelPanelList;

    private Container characterSelectionContainer;
    private Container weaponSelectionContainer;

    public Controller(List<CharacterSelectionPanel> charSelPanelList, List<WeaponSelectionPanel> weaponSelPanelList,
                      Container container)
    {
        this.charSelPanelList = charSelPanelList;
        this.weaponSelPanelList = weaponSelPanelList;

        characterSelectionContainer = new JPanel();
        weaponSelectionContainer = new JPanel();

        container.add(characterSelectionContainer);
        container.add(weaponSelectionContainer);

        for(CharacterSelectionPanel panel : this.charSelPanelList) {
            panel.setVisible(false);
            this.characterSelectionContainer.add(panel);
        }

        for (WeaponSelectionPanel panel : this.weaponSelPanelList) {
            panel.setVisible(false);
            this.weaponSelectionContainer.add(panel);
        }
    }

    public void beginnerButtonPushed() {
        System.out.println("beginner mode is ON");
        getCharacterSelectionPanel(DifficultyMode.BEGINNER);
        getWeaponSelectionPanel(DifficultyMode.BEGINNER);
    }

    public void intermediateButtonPushed() {
        System.out.println("intermediate mode is ON");
        getCharacterSelectionPanel(DifficultyMode.INTERMEDIATE);
        getWeaponSelectionPanel(DifficultyMode.INTERMEDIATE);
    }

    public void advanceButtonPushed() {
        System.out.println("advance mode is ON");
        getCharacterSelectionPanel(DifficultyMode.ADVANCE);
        getWeaponSelectionPanel(DifficultyMode.ADVANCE);
    }

    private void getCharacterSelectionPanel(DifficultyMode mode) {

        for (int i = 0; i < charSelPanelList.size(); i++) {
            CharacterSelectionPanel panel = charSelPanelList.get(i);
            if (panel.getMode() == mode) {
                panel.paint();
            } else {
                panel.erase();
            }
        }
    }

    private void getWeaponSelectionPanel(DifficultyMode mode) {

        for (int i = 0; i < weaponSelPanelList.size(); i++) {
            WeaponSelectionPanel panel = weaponSelPanelList.get(i);
            if (panel.getMode() == mode) {
                panel.paint();
            } else {
                panel.erase();
            }
        }
    }
}
