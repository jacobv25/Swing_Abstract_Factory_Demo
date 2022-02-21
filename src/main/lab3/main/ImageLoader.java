package main.lab3.main;

import javax.swing.*;

public class ImageLoader {

    private String path;

    public ImageLoader(String path) {
        this.path = path;
    }

    public ImageIcon loadImage() {
        try {
            return new ImageIcon(getClass().getResource(path));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
