package main.lab3.view;

import main.lab3.main.ImageLoader;
import main.lab3.main.Utility;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    private JPanel rootContainer;
    private JPanel infoPanel;
    private JPanel modeButtonPanel;
    private JPanel imagePanel;
    private JPanel selectionPanelContainer;
    private JPanel characterSelectionPanel;

    public CustomFrame() {
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rootContainer = new JPanel(new BorderLayout());
        infoPanel = new InfoPanel();
        modeButtonPanel = new ModeButtonPanel(this);
        imagePanel = new JPanel();

        //load image
        ImageLoader imageLoader = new ImageLoader(Utility.MAN_WALKING_PATH);
        ImageIcon image = imageLoader.loadImage();
        JLabel label = new JLabel(image);
        imagePanel.add(label);

        infoPanel.setVisible(true);
        modeButtonPanel.setVisible(true);
        imagePanel.setVisible(true);

        rootContainer.add(infoPanel, BorderLayout.NORTH);
        rootContainer.add(modeButtonPanel, BorderLayout.CENTER);
        rootContainer.add(imagePanel, BorderLayout.SOUTH);

        add(rootContainer);

        setVisible(true);
    }

    public void beginnerButtonPushed() {
        System.out.println("beginner mode");
    }

    public void intermediateButtonPushed() {
        System.out.println("intermediate mode");
    }

    public void advanceButtonPushed() {
        System.out.println("advance mode");
    }
}
