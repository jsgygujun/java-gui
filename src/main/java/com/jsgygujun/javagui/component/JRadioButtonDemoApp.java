package com.jsgygujun.javagui.component;

import javax.swing.*;

/**
 * @author GuJun
 * @date 2020/10/25
 */
public class JRadioButtonDemoApp {

    private final JFrame frame = new JFrame("Java 单选组件示例");
    private final JPanel rootPanel = new JPanel();

    private final JLabel label = new JLabel("季节：");
    private final JRadioButton b1 = new JRadioButton("春");
    private final JRadioButton b2 = new JRadioButton("夏");
    private final JRadioButton b3 = new JRadioButton("秋", true);
    private final JRadioButton b4 = new JRadioButton("冬");

    private final JButton btn = new JButton("Clip");

    private final ButtonGroup bg = new ButtonGroup();


    private void layout() {
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);

        rootPanel.add(label);
        rootPanel.add(b1);
        rootPanel.add(b2);
        rootPanel.add(b3);
        rootPanel.add(b4);

        rootPanel.add(btn);

        frame.add(rootPanel);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        btn.addActionListener((e) -> {
            System.out.printf("Radio状态： 春(%b),夏(%b),秋(%b),冬(%b)\n",
                    b1.isSelected(),
                    b2.isSelected(),
                    b3.isSelected(),
                    b4.isSelected());
        });
    }

    public JRadioButtonDemoApp() {
        layout();
        init();
    }

    public static void main(String[] args) {
        new JRadioButtonDemoApp();
    }
}
