package com.jsgygujun.javagui.component;

import javax.swing.*;
import java.awt.*;

/**
 * JTextArea：文本域组件
 * 文本域与文本框的最大区别就是文本域允许用户输入多行文本信息
 * 构造函数：
 * JTextArea()：创建一个默认的文本域。
 * JTextArea(int rows,int columns)：创建一个具有指定行数和列数的文本域。
 * JTextArea(String text)：创建一个包含指定文本的文本域。
 * JTextArea(String text,int rows,int columns)：创建一个既包含指定文本，又包含指定行数和列数的多行文本域。
 *
 * 常用方法：
 * 方法名称	                                            说明
 * void append(String str)	                            将字符串 str 添加到文本域的最后位置
 * void setColumns(int columns)	                        设置文本域的行数
 * void setRows(int rows)	                            设置文本域的列数
 * int getColumns()	                                    获取文本域的行数
 * void setLineWrap(boolean wrap)	                    设置文本域的换行策略
 * int getRows()	                                    获取文本域的列数
 * void insert(String str,int position)	                插入指定的字符串到文本域的指定位置
 * void replaceRange(String str,int start,int end)	    将指定的开始位 start 与结束位 end 之间的字符串用指定的字符串 str 取代
 *
 * @author GuJun
 * @date 2020/10/20
 */
public class JTextAreaDemoApp {

    JFrame frame = new JFrame("JTextArea 示例");
    JPanel panel = new JPanel();
    JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JTextArea textArea = new JTextArea("请输入内容", 7, 20);

    private void init() {
        textArea.setLineWrap(true);             // 设置文本域中的文本为自动换行
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.YELLOW);
        textArea.setFont(new Font("楷体", Font.BOLD, 16));

        scrollPane.setViewportView(textArea);
        panel.add(scrollPane);
        frame.add(panel);
        frame.setBounds(100, 100, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JTextAreaDemoApp app = new JTextAreaDemoApp();
        app.init();
    }

}
