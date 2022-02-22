package main.lab3.view;

import javax.swing.*;

public class ImagePanel extends JPanel {

    private ImageIcon imageIcon;
    private JLabel label;

    public ImagePanel(ImageIcon imageIcon) {

        this.imageIcon = imageIcon;
        label = new JLabel(imageIcon);
        add(label);
        setVisible(true);
    }

//    public ImagePanel() {
//    }
}
