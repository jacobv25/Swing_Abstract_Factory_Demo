package main.lab3.mvc.controller;

import main.lab3.Factory.*;
//import main.lab3.events.DifficultyModeActionListener;

import javax.swing.*;

public class Utility {

    //CONSTANTS
        public static final String PINK_CHARACTER_PATH = "/pink-character-2.png";
        public static final String MAN_WALKING_PATH = "/man-walking-2.gif";
        public static final String CHARACTER_1_PATH = "/character-2.png";

        public static final String WOODCUTTER_BEG_PATH = "/woodcutter/woodcutter-idle.gif";
        public static final String GRAVE_ROBBER_BEG_PATH = "/grave-robber/grave-robber-idle.gif";
        public static final String STEAM_LADY_BEG_PATH = "/steam-lady/steam-lady-idle.gif";

        public static final String WOODCUTTER_INT_PATH = "/woodcutter/woodcutter-walk.gif";
        public static final String GRAVE_ROBBER_INT_PATH = "/grave-robber/grave-robber-walk.gif";
        public static final String STEAM_LADY_INT_PATH = "/steam-lady/steam-lady-walk.gif";

        public static final String WOODCUTTER_ADV_PATH = "/woodcutter/woodcutter-run.gif";
        public static final String GRAVE_ROBBER_ADV_PATH = "/grave-robber/grave-robber-run.gif";
        public static final String STEAM_LADY_ADV_PATH = "/steam-lady/steam-lady-run.gif";

        public static final String WOODCUTTER_ATK_BEG_PATH = "/woodcutter/woodcutter-atk1.gif";
        public static final String GRAVE_ROBBER_ATK_BEG_PATH = "/grave-robber/grave-robber-atk1.gif";
        public static final String STEAM_LADY_ATK_BEG_PATH = "/steam-lady/steam-lady-atk1.gif";

        public static final String WOODCUTTER_ATK_INT_PATH = "/woodcutter/woodcutter-atk2.gif";
        public static final String GRAVE_ROBBER_ATK_INT_PATH = "/grave-robber/grave-robber-atk2.gif";
        public static final String STEAM_LADY_ATK_INT_PATH = "/steam-lady/steam-lady-atk2.gif";

        public static final String WOODCUTTER_ATK_ADV_PATH = "/woodcutter/woodcutter-atk3.gif";
        public static final String GRAVE_ROBBER_ATK_ADV_PATH = "/grave-robber/grave-robber-atk3.gif";
        public static final String STEAM_LADY_ATK_ADV_PATH = "/steam-lady/steam-lady-atk3.gif";

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

    public ImageIcon loadImage(String path) {
        ImageFactory imageFactory = new ImageFactory();
        imageFactory.setPath(path);
        return imageFactory.loadImage();

    }




}
