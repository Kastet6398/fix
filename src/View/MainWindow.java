package View;

import Controller.MainController;

import javax.swing.*;

public class MainWindow extends BaseWindow{
    JButton btn1;
    JButton btn2;
    public MainWindow(int w, int h, MainController controller) {
        super(w, h, controller);
        btn1 = createBtn(100, 100, "Module1");
        btn2 = createBtn(350, 100, "Module2");
    }
    public JButton getBtn1() {
        return btn1;
    }
    public JButton getBtn2() {
        return btn2;
    }
}