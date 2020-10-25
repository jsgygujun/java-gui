package com.jsgygujun.javagui.form;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

/**
 * @author GuJun
 * @date 2020/10/24
 */
public class Layout {
    private JButton button1;
    private JPanel rootPanel;
    private JLabel label;
    private JList<String> list1;
    private JTextField textField1;
    private JTable table;
    private int cnt;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout");
        frame.setContentPane(new Layout().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Layout() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button1 pressed...");
                label.setText("Button1 pressed..." + (++cnt));
            }
        });

        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                List<String> selectedItems = list1.getSelectedValuesList();
                textField1.setText(selectedItems.toString());
            }
        });
    }
}
