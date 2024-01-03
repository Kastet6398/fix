package Modules.Logic;

import Views.MainWindow;
import javax.swing.*;

public abstract class Base_LogicModule extends JFrame {
    private final MainWindow menu;
    private int ammo = 2;

    public Base_LogicModule(MainWindow menu) {
        this.menu = menu;
    }

    public void reload(){
        ammo = (ammo<2)?2:0;
        System.out.println("Reload "+ammo);
    }

    public void fire(){
        ammo = (ammo==0)?0:ammo-1;
        menu.getCharacter().anim();
        System.out.println("Fire "+ammo);
    }
}