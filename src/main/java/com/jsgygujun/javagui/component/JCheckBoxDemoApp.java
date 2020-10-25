package com.jsgygujun.javagui.component;

import javax.swing.*;

/**
 * 复选框组件
 * 一个复选框有选中和未选中两种状态，并且可以同时选定多个复选框.
 *
 * 构造函数：
 * JCheckBox()：                             创建一个默认的复选框，在默认情况下既未指定文本，也未指定图像，并且未被选择。
 * JCheckBox(String text)：                  创建一个指定文本的复选框。
 * JCheckBox(String text,boolean selected)： 创建一个指定文本和选择状态的复选框。
 *
 * @author GuJun
 * @date 2020/10/25
 */
public class JCheckBoxDemoApp {

    private final JFrame frame = new JFrame("Java 复选框组件示例");
    private final JPanel rootPanel = new JPanel();

    private final JLabel label = new JLabel("流行编程语言有：");
    private final JCheckBox chkBox1 = new JCheckBox("C#", true);
    private final JCheckBox chkBox2 = new JCheckBox("C++", false);
    private final JCheckBox chkBox3 = new JCheckBox("Java", false);
    private final JCheckBox chkBox4 = new JCheckBox("Python", false);
    private final JCheckBox chkBox5 = new JCheckBox("PHP", false);
    private final JButton button = new JButton("check");

    private void layout() {
        rootPanel.add(label);
        rootPanel.add(chkBox1);
        rootPanel.add(chkBox2);
        rootPanel.add(chkBox3);
        rootPanel.add(chkBox4);
        rootPanel.add(chkBox5);
        rootPanel.add(button);
        frame.add(rootPanel);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        button.addActionListener((e)-> {
            System.out.printf("复选框状态： C#(%b),C++(%b),Java(%b),Python(%b),PHP(%b)\n",
                    chkBox1.isSelected(),
                    chkBox2.isSelected(),
                    chkBox3.isSelected(),
                    chkBox4.isSelected(),
                    chkBox5.isSelected());
        });
    }

    public JCheckBoxDemoApp() {
        layout();
        init();
    }

    public static void main(String[] args) {
        JCheckBoxDemoApp app = new JCheckBoxDemoApp();
    }
}
