package main.lab3.mvc.view;

import main.lab3.SelectionPanel.CharacterSelectionPanel;
import main.lab3.SelectionPanel.WeaponSelectionPanel;
import main.lab3.mvc.controller.DifficultyMode;
import main.lab3.mvc.controller.Utility;
import main.lab3.mvc.controller.Controller;
import main.lab3.mvc.model.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {

    private final Controller controller;
    private final JPanel rootContainer;
    private final JPanel infoPanel;
    private final JPanel modeButtonPanel;
    private ImagePanel woodcutter_imagePanel;
    private ImagePanel graverobber_imagePanel;
    private ImagePanel manwalking_imagePanel;
    private CharacterSelectionPanel characterSelectionPanelBeginner;
    private CharacterSelectionPanel characterSelectionPanelIntermediate;
    private CharacterSelectionPanel characterSelectionPanelAdvance;
    private WeaponSelectionPanel weaponSelectionPanelBeginner;
    private WeaponSelectionPanel weaponSelectionPanelIntermediate;
    private WeaponSelectionPanel weaponSelectionPanelAdvance;
    private JPanel selectionPanel;

    public MainWindow() {
        //BEGINNER Character Selection
        characterSelectionPanelBeginner = new CharacterSelectionPanel(DifficultyMode.BEGINNER);
        characterSelectionPanelBeginner.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.WOODCUTTER_BEG_PATH)));
        characterSelectionPanelBeginner.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.GRAVE_ROBBER_BEG_PATH)));
        characterSelectionPanelBeginner.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.STEAM_LADY_BEG_PATH)));

        //BEGINNER Weapon Selection
        weaponSelectionPanelBeginner = new WeaponSelectionPanel(DifficultyMode.BEGINNER);
        weaponSelectionPanelBeginner.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.WOODCUTTER_ATK_BEG_PATH)));
        weaponSelectionPanelBeginner.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.GRAVE_ROBBER_ATK_BEG_PATH)));
        weaponSelectionPanelBeginner.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.STEAM_LADY_ATK_BEG_PATH)));

        //INTERMEDIATE Character Selection
        characterSelectionPanelIntermediate = new CharacterSelectionPanel(DifficultyMode.INTERMEDIATE);
        characterSelectionPanelIntermediate.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.WOODCUTTER_INT_PATH)));
        characterSelectionPanelIntermediate.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.GRAVE_ROBBER_INT_PATH)));
        characterSelectionPanelIntermediate.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.STEAM_LADY_INT_PATH)));

        //INTERMEDIATE Weapon Selection
        weaponSelectionPanelIntermediate = new WeaponSelectionPanel(DifficultyMode.INTERMEDIATE);
        weaponSelectionPanelIntermediate.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.WOODCUTTER_ATK_INT_PATH)));
        weaponSelectionPanelIntermediate.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.GRAVE_ROBBER_ATK_INT_PATH)));
        weaponSelectionPanelIntermediate.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.STEAM_LADY_ATK_INT_PATH)));

        //ADVANCE Character Selection
        characterSelectionPanelAdvance = new CharacterSelectionPanel(DifficultyMode.ADVANCE);
        characterSelectionPanelAdvance.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.WOODCUTTER_ADV_PATH)));
        characterSelectionPanelAdvance.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.GRAVE_ROBBER_ADV_PATH)));
        characterSelectionPanelAdvance.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.STEAM_LADY_ADV_PATH)));

        //ADVANCE Weapon Selection
        weaponSelectionPanelAdvance = new WeaponSelectionPanel(DifficultyMode.ADVANCE);
        weaponSelectionPanelAdvance.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.WOODCUTTER_ATK_ADV_PATH)));
        weaponSelectionPanelAdvance.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.GRAVE_ROBBER_ATK_ADV_PATH)));
        weaponSelectionPanelAdvance.addPanel(new ImagePanel(Utility.getInstance().loadImage(Utility.STEAM_LADY_ATK_ADV_PATH)));


        // ADD TO PANEL LISTS !
        List<CharacterSelectionPanel> charSelPanelList = new ArrayList<>();
        charSelPanelList.add(characterSelectionPanelBeginner);
        charSelPanelList.add(characterSelectionPanelIntermediate);
        charSelPanelList.add(characterSelectionPanelAdvance);

        List<WeaponSelectionPanel> weaponSelPanelList = new ArrayList<>();
        weaponSelPanelList.add(weaponSelectionPanelBeginner);
        weaponSelPanelList.add(weaponSelectionPanelIntermediate);
        weaponSelPanelList.add(weaponSelectionPanelAdvance);

        setSize(800,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rootContainer = new JPanel(new BorderLayout());
        selectionPanel = new JPanel(new FlowLayout());

        infoPanel = new InfoPanel();
        controller = new Controller(charSelPanelList, weaponSelPanelList, selectionPanel);
        modeButtonPanel = new ModeButtonPanel(controller);

        infoPanel.setVisible(true);
        modeButtonPanel.setVisible(true);

        rootContainer.add(infoPanel, BorderLayout.NORTH);
        rootContainer.add(modeButtonPanel, BorderLayout.CENTER);
        rootContainer.add(selectionPanel, BorderLayout.SOUTH);

        add(rootContainer);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new MainWindow();
                    }
                }
        );
    }

}
