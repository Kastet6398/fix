package Controllers;

import Modules.Anims.Base_AnimModule;
import Modules.Logic.Base_LogicModule;
import Views.MainWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class BaseController implements KeyListener, MouseListener {
// Vars
    private final MainWindow window;
    private Base_LogicModule logicModule;
    private Base_AnimModule animModule;

// Functions

  // Constructor
    public BaseController(){
        this.window = new MainWindow(800, 800, this);
    }

    //Getters & Setters
    public MainWindow getWindow() {
        return window;
    }

    public Base_LogicModule getLM() {
        return logicModule;
    }

    public void setLM(Base_LogicModule module) {
        this.logicModule = module;
    }

    public Base_AnimModule getAM() {
        return animModule;
    }

    public void setAM(Base_AnimModule animModule) {
        this.animModule = animModule;
    }

  // Keyboard
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {}

  // Mouse
    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
}