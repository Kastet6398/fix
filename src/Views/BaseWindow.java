package Views;

import Controllers.BaseController;

import javax.swing.*;
import java.awt.*;

public abstract class BaseWindow extends JFrame{
    private final BaseController controller;
    private Character character;

    public BaseWindow(int w, int h, BaseController controller){
        super();

        this.controller=controller;

        setSize(w, h);
        setLayout(null);

        character = new Character();
        character.setBounds(0, 0, 110, 106);
        add(character);

        addKeyListener(controller);
        addMouseListener(controller);

        setVisible(true);
    }
    public Character getCharacter() {
        return character;
    }
}