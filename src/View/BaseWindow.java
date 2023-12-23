package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class BaseWindow extends JFrame{
    private JLabel label;
    private ActionListener listener;
    public BaseWindow(int w, int h, ActionListener listener){
        super();
        this.listener=listener;
        setSize(w, h);
        setLayout(null);
        createBtn();
        setVisible(true);
    }
    public void createBtn(){
        JButton btn = new JButton();
        btn.setBounds(100, 100, 200, 80);
        label = createLabel("Click me");
        btn.add(label);
        btn.addActionListener(listener);
        add(btn);
        btn.setVisible(true);
    }
    public JLabel createLabel(String txt){
        JLabel label = new JLabel(txt);
        return label;
    }
    public JLabel getLabel() {
        return label;
    }

}
