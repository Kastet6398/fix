package Controller;

import Modules.BaseModule;
import Modules.Module1;
import Modules.Module2;
import View.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {
    private MainWindow menu;
    private BaseModule module = null;

    public MainController(){
        MainWindow mainWindow = new MainWindow(600, 400, this);
        this.menu = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Module1":
                module = new Module1(menu);
                module.setLabel(menu.getBtn1(), "Btn1 clicked");
            case "Module2":
                module = new Module2(menu);
                module.setLabel(menu.getBtn2(), "Btn2 clicked");
        }
    }

    public void createWindow(int w, int h, ActionListener listener) {
        module.createWindow(w, h, this);
    }
}