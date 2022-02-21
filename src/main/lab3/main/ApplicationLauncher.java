package main.lab3.main;

import main.lab3.view.CustomFrame;

import javax.swing.*;

public class ApplicationLauncher {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new CustomFrame();
    }
}
