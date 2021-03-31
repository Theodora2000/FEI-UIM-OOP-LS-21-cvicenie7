package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Okno extends JFrame{
    public Okno()throws HeadlessException{
        super();
        this.setVisible(true);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var btn = new JButton("button");
        this.add(btn);
        btn.addActionListener(e-> System.out.println("click"));

    }
}
