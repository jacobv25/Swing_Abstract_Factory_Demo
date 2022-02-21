package main.lab3.view;

import main.lab3.main.DifficultyMode;
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
    private ImageLoader imageLoader;
    private ImageIcon image;
    private JLabel imageContainerLabel;

    public CustomFrame() {
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rootContainer = new JPanel(new BorderLayout());
        infoPanel = new InfoPanel();
        modeButtonPanel = new ModeButtonPanel(this);
        imagePanel = new JPanel();

        imageLoader = new ImageLoader();
        imageContainerLabel = new JLabel();

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
        System.out.println("beginner mode ON");
        loadImageOntoPanel(Utility.CHARACTER_1_PATH);
    }

    public void intermediateButtonPushed() {
        System.out.println("intermediate mode ON");
        loadImageOntoPanel(Utility.PINK_CHARACTER_PATH);
    }

    public void advanceButtonPushed() {
        System.out.println("advance mode ON");
        loadImageOntoPanel(Utility.MAN_WALKING_PATH);
    }

    private void loadImageOntoPanel(String path) {
        imageLoader.setPath(path);
        image = imageLoader.loadImage();
        imageContainerLabel.setIcon(image);
        int size = imagePanel.getComponents().length;
        if(size != 0) {
            imagePanel.remove(size-1);
        }
        imagePanel.add(imageContainerLabel);
    }
}
