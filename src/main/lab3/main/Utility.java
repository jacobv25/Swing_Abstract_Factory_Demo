package main.lab3.main;

import main.lab3.Factory.*;
//import main.lab3.events.DifficultyModeActionListener;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Utility {

    //CONSTANTS
        public static final String PINK_CHARACTER_PATH = "/pink-character-2.png";
        public static final String MAN_WALKING_PATH = "/man-walking-2.gif";
        public static final String CHARACTER_1_PATH = "/character-2.png";
        public static final String WOODCUTTER_PATH = "/woodcutter-4.gif";
        public static final String GRAVE_ROBBER_PATH = "/grave-robber.gif";
        public static final String STEAM_LADY_PATH = "/steam-lady.gif";

    //END OF CONSTANTS

    private static Utility instance = new Utility();

    private Utility() {};

    public static Utility getInstance() {
        return instance;
    }

    public AbstractSelectionPanelFactoryIF createSelectionPanelFactory(PanelType panelType) {
        switch (panelType) {
            case CHARACTER_SELECTION :
                return new CharacterSelectionPanelFactory();
            case WEAPON_SELECTION :
                return new WeaponSelectionPanelFactory();
            default:
                return null;
        }
    }

    public DifficultyMode InputToMode(String input) {
        switch (input) {
            case "0":
                return DifficultyMode.BEGINNER;
            case "1":
                return DifficultyMode.INTERMEDIATE;
            case "2":
                return DifficultyMode.ADVANCE;
            default:
                return null;
        }
    }




}
