package Modules;

import Controller.MainController;
import View.MainWindow;
import View.Window;

import javax.swing.*;

public abstract class BaseModule {
    private MainWindow menu;

    public BaseModule(MainWindow menu) {
        this.menu = menu;
    }
    public void setLabel(JButton btn, String lbltxt){
        menu.setBtnTxt(btn, lbltxt);
    }
    public void createWindow(int w, int h, MainController listener){
        Window window = new Window(w, h, listener);
    }
}