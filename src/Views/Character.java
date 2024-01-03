package Views;

import Modules.Anims.AM_Wpn;
import Modules.Anims.Base_AnimModule;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Character extends JPanel {
    private BufferedImage img;
    private int x = -40;
    private int y = 0;

    public Character() {
        try {
            img = ImageIO.read(new File("src/Refs/Sprite.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void nextFire() {
        x -= 100;
        getParent().repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, x, y, null);
    }

    public void anim() {
        Base_AnimModule animModule = new AM_Wpn(this);
        animModule.start();
    }
}