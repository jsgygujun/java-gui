package com.jsgygujun.javagui.component;

import javax.swing.*;

/**
 * @author GuJun
 * @date 2020/10/20
 */
public class JLabelDemoApp {

    JFrame frame = new JFrame("JLabel 示例"); // 创建Frame窗口
    JPanel panel = new JPanel(); // 创建面板
    JLabel label = new JLabel("这个一个JLabel");

    private void init() {
        panel.add(label); // 添加到面板
        frame.add(panel);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JLabelDemoApp app = new JLabelDemoApp();
        app.init();
    }

}
