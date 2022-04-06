package com.exaple.awsample;

import java.awt.*; // Will import all the class Interfaces and static objects from the java.awt class
import java.awt.event.WindowAdapter; // java.awt.event is actually a different package than java.awt and
import java.awt.event.WindowEvent; // the imports are still needed for these Classes

public class MyWindow extends Frame {
    public MyWindow(String title) { //removed// throws HeadlessException {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosed(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}
