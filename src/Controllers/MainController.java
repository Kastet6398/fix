package Controllers;

import Modules.Anims.AM_Wpn;
import Modules.Logic.LM_Wpn;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MainController extends BaseController{

    public MainController(){
        setLM(new LM_Wpn(getWindow()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'R':
                getLM().reload();
                break;
            case 'r':
                getLM().reload();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + e.getKeyChar());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        getLM().fire();
    }
}