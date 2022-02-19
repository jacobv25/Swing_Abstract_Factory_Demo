package com.lab3.main;

import com.lab3.Factory.SelectionPanelFactory;
import com.lab3.Factory.SelectionPanelFactoryIF;
import com.lab3.SelectionPanel.SelectionPanelF;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        int value = 0;
        SelectionPanelFactoryIF factory = new SelectionPanelFactory();

        do {

            System.out.println("Enter 0 for beginner, 1 for intermediate, 2 for advance");

            input = scanner.next();

            while (!input.equals("0") && !input.equals("1") && !input.equals("2")) {
                System.out.println("Incorrect answer! Please answer 0, 1 or 2");
                input = scanner.next();
            }

            //convert input to difficulty mode
            DifficultyMode mode = Utility.getInstance().InputToMode(input);

            SelectionPanelF csp = Utility.getInstance().getSelectionPanelFactory().createCharacterSelectionPanel(mode);
            SelectionPanelF wsp = Utility.getInstance().getSelectionPanelFactory().createWeaponSelectionPanel(mode);

            csp.paint();
            wsp.paint();

        }while(true);
    }
}
