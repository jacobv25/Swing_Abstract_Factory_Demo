package main.lab3.mvc.controller;

import main.lab3.Factory.ImageFactory;

import javax.swing.*;

public class ImageLoader {
    private ImageFactory imageFactory;
    private ImageIcon imageIcon;
    private JLabel imageContainerLabel;

    public ImageLoader() {
        imageFactory = new ImageFactory();
        imageIcon = new ImageIcon();
        imageContainerLabel = new JLabel();
    }

    public JLabel loadImageContainerLabel(String path) {
        imageFactory.setPath(path);
        imageIcon = imageFactory.loadImage();
        imageContainerLabel.setIcon(imageIcon);
        return imageContainerLabel;
    }

}
