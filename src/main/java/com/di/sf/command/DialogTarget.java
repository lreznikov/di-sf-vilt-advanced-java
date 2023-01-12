package com.di.sf.command;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.time.LocalDateTime;

public class DialogTarget implements Target {
    @Override
    public void displayTime(LocalDateTime dateTime) {
        JFrame jFrame = new JFrame("Title");
        JPanel contentPane = new JPanel(new FlowLayout());
        JLabel jLabel = new JLabel("The time is: " + dateTime.toString());
        contentPane.add(jLabel);
        jFrame.setContentPane(contentPane);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
