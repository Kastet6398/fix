package View;

import Controller.MainController;

import javax.swing.*;

public abstract class BaseWindow extends JFrame{
    private final MainController controller;
    public BaseWindow(int w, int h, MainController controller){
        super();
        this.controller=controller;
        setSize(w, h);
        setLayout(null);
        setVisible(true);
    }

    public JButton createBtn(int x, int y, String txt){
        JButton btn = new JButton(txt);
        btn.setBounds(x, y, 200, 80);
        btn.addActionListener(controller);
        add(btn);
        btn.setVisible(true);
        return btn;
    }
    public void setBtnTxt(JButton btn, String txt){
        btn.setText(txt);
    }
}