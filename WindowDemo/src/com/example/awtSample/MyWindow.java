package com.example.awtSample;

import java.awt.*;      //access to everything in that class
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {//Frame is inbuilt class
    public MyWindow(String title) {
        super(title);
        setSize(500,400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SanSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60 , 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Priya Sinha", 60, 100);
    }
}
