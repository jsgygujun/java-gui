package com.jsgygujun.javagui.component;

import javax.swing.*;
import java.awt.*;

/**
 * JTextField：单行文本框组件
 * Swing 中使用 JTextField 类实现一个单行文本框，它允许用户输入单行的文本信息
 * 构造方法：
 * JTextField()：                                    创建一个默认的文本框。
 * JTextField(String text)：                         创建一个指定初始化文本信息的文本框。
 * JTextField(int columns)：                         创建一个指定列数的文本框。
 * JTextField(String text,int columns)：             创建一个既指定初始化文本信息，又指定列数的文本框。
 *
 * 常用方法：
 * 方法名称	                                        说明
 * Dimension getPreferredSize()	                    获得文本框的首选大小
 * void scrollRectToVisible(Rectangle r)	        向左或向右滚动文本框中的内容
 * void setColumns(int columns)	                    设置文本框最多可显示内容的列数
 * void setFont(Font f)	                            设置文本框的字体
 * void setScrollOffset(int scrollOffset)	        设置文本框的滚动偏移量（以像素为单位）
 * void setHorizontalAlignment(int alignment)	    设置文本框内容的水平对齐方式
 *
 *
 * @author GuJun
 * @date 2020/10/20
 */
public class JTextFieldDemoApp {

    JFrame frame = new JFrame("JTextField 示例"); // 创建Frame窗口
    JPanel panel = new JPanel(); // 创建面板
    JTextField textField1 = new JTextField(); // 创建文本框
    JTextField textField2 = new JTextField(26); //
    JTextField textField3 = new JTextField(30);

    private void init() {
        textField1.setText("普通文本框");
        textField2.setFont(new Font("楷体", Font.BOLD, 16));
        textField2.setText("指定长度和字体的文本框");
        textField3.setText("居中对齐");
        textField3.setHorizontalAlignment(JTextField.CENTER);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);
        frame.add(panel);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JTextFieldDemoApp app = new JTextFieldDemoApp();
        app.init();
    }
}
