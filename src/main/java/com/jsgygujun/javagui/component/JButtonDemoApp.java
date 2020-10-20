package com.jsgygujun.javagui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 构造方法：
 * JButton()：创建一个无标签文本、无图标的按钮。
 * JButton(Icon icon)：创建一个无标签文本、有图标的按钮。
 * JButton(String text)：创建一个有标签文本、无图标的按钮。
 * JButton(String text,Icon icon)：创建一个有标签文本、有图标的按钮。
 *
 * 常用方法：
 * 方法名称	说明
 * addActionListener(ActionListener listener)	        为按钮组件注册 ActionListener 监听
 * void setIcon(Icon icon)	                            设置按钮的默认图标
 * void setText(String text)	                        设置按钮的文本
 * void setMargin(Insets m)	                            设置按钮边框和标签之间的空白
 * void setMnemonic(int mnemonic)	                    设置按钮的键盘快捷键，所设置的快捷键在实际操作时需要结合 Alt 键进行实现
 * void setPressedIcon(Icon icon)	                    设置按下按钮时的图标
 * void setSelectedIcon(Icon icon)	                    设置选择按钮时的图标
 * void setRolloveiicon(Icon icon)	                    设置鼠标移动到按扭区域时的图标
 * void setDisabledIcon(Icon icon)	                    设置按钮无效状态下的图标
 * void setVerticalAlignment(int align)	                设置图标和文本的垂直对齐方式
 * void setHorizontalAlignment(int align)	            设置图标和文本的水平对齐方式
 * void setEnable(boolean flag)	                        启用或禁用按扭
 * void setVerticalTextPosition(int textPosition)	    设置文本相对于图标的垂直位置
 * void setHorizontalTextPosition(int textPosition)	    设置文本相对于图标的水平位置
 *
 * @author GuJun
 * @date 2020/10/20
 */
public class JButtonDemoApp {

    JFrame frame = new JFrame("JButton 示例");
    JPanel panel = new JPanel();
    JButton button1 = new JButton("我是普通按钮");
    JButton button2 = new JButton("我是带背景颜色按钮");
    JButton button3 = new JButton("我是不可用按钮");
    JButton button4 = new JButton("我是底部对齐的按钮");

    private void init() {
        panel.add(button1);
        button2.setBackground(Color.BLUE); // 设置按钮背景色
        panel.add(button2);
        button3.setEnabled(false); // 设置按钮不可用
        panel.add(button3);
        button4.setPreferredSize(new Dimension(160, 60)); // 设置尺寸
        button4.setVerticalAlignment(SwingConstants.BOTTOM); // 设置按钮垂直对齐方式
        panel.add(button4);
        frame.add(panel);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        JButtonDemoApp app = new JButtonDemoApp();
        app.init();
    }
}
