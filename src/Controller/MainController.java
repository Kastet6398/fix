package Controller;

import Modules.BaseModule;
import Modules.Module1;
import Modules.Module2;
import View.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {
    BaseModule module;
    public MainController(){
        MainWindow mainWindow = new MainWindow(600, 400, this);
        this.module = new Module2(mainWindow, "sasassa");
    }

    public void createWindow(int w, int h, ActionListener listener) {
        BaseModule.createWindow(w, h, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        module.setLabel();
        System.out.println(module.getLbltxt());
    }
}