package Modules;

import View.BaseWindow;
import View.Window;

import java.awt.event.ActionListener;

public abstract class BaseModule {
    private String lbltxt;
    private final BaseWindow window;

    public BaseModule(BaseWindow window, String lbltxt) {
        this.window = window;
        this.lbltxt=lbltxt;
    }
    public void setLabel(){
        window.getLabel().setText(this.lbltxt);
    }
    public static void createWindow(int w, int h, ActionListener listener){
        Window window = new Window(w, h, listener);
    }

    public String getLbltxt() {
        return lbltxt;
    }
}
