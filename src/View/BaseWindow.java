package View;

import Controller.MainController;

import javax.swing.*;

public abstract class BaseWindow extends JFrame{
    private MainController controller;
    public BaseWindow(int w, int h, MainController controller){
        super();
        setSize(w, h);
        setLayout(null);
        this.controller=controller;
        setVisible(true);
    }

    public JButton createBtn(int x, int y, String txt){
        JButton btn = new JButton();
        btn.setBounds(x, y, 200, 80);
        btn.setText(txt);
        btn.addActionListener(controller);
        add(btn);
        btn.setVisible(true);
        return btn;
    }
    public void setBtnTxt(JButton btn, String txt){
        btn.setText(txt);
    }
}
