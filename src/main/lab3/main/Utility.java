package main.lab3.main;

import main.lab3.Factory.SelectionPanelFactory;
import main.lab3.Factory.SelectionPanelFactoryIF;
//import main.lab3.events.DifficultyModeActionListener;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Utility {

    //CONSTANTS
    public static final String PINK_CHARACTER_PATH = "/pink-character.png";
    public static final String MAN_WALKING_PATH = "/man-walking-2.gif";
    //END OF CONSTANTS

    private static Utility instance = new Utility();

    private Utility() {};

    public static Utility getInstance() {
        return instance;
    }

    public SelectionPanelFactoryIF getSelectionPanelFactory() {
        return  new SelectionPanelFactory();
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