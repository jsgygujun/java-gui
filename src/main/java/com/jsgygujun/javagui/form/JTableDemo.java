package com.jsgygujun.javagui.form;

import javax.swing.*;

/**
 * @author GuJun
 * @date 2020/10/24
 */
public class JTableDemo {
    private JTable table1;
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTableDemo");
        frame.setContentPane(new JTableDemo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
