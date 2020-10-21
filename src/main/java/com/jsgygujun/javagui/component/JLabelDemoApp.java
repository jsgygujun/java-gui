package com.jsgygujun.javagui.component;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 标签是一种可以包含文本和图片的非交互组件。
 * 构造方法：
 * JLabel()：                                                创建无图像并且标题为空字符串的 JLabel。
 * JLabel(Icon image)：                                      创建具有指定图像的 JLabel。
 * JLabel(String text)：                                     创建具有指定文本的 JLabel。
 * JLabel(String textIcon image,int horizontalAlignment)：   创建具有指定文本、图像和水平对齐方式的 JLabel，
 *                                                           horizontalAlignment 取值：JLabel.LEFT、JLabel.RIGHT 和 JLabel.CENTER。
 * 常用方法：
 * 方法名称	                                                说明
 * void setText(String text)	                            定义 JLabel 将要显示的单行文本
 * void setIcon(Icon image)	                                定义 JLabel 将要显示的图标
 * void setIconTextGap(int iconTextGap)	                    如果 JLabel 同时显示图标和文本，则此属性定义它们之间的间隔
 * void setHorizontalTextPosition(int textPosition)	        设置 JLabel 的文本相对其图像的水平位置
 * void setHorizontalAlignment(int alignment)	            设置标签内容沿 X 轴的对齐方式
 * int getText()	                                        返回 JLabel 所显示的文本字符串
 * Icon getIcon()	                                        返回 JLabel 显示的图形图像
 * Component getLabelFor()	                                获得将 JLabel 添加到的组件
 * int getIconTextGap()	                                    返回此标签中显示的文本和图标之间的间隔量
 * int getHorizontalTextPosition()	                        返回 JLabel 的文本相对其图像的水平位置
 * int getHorizontalAlignment()	                            返回 JLabel 沿 X 轴的对齐方式
 *
 * @author GuJun
 * @date 2020/10/20
 */
public class JLabelDemoApp {

    JFrame frame = new JFrame("JLabel 示例"); // 创建Frame窗口
    JPanel panel = new JPanel(); // 创建面板
    JLabel label = new JLabel("这个一个JLabel");

    private void init() {
        panel.add(label); // 添加到面板        frame.add(panel);
        frame.setIconImage(new ImageIcon("src/main/resources/alien.png").getImage());
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JLabelDemoApp app = new JLabelDemoApp();
        app.init();
    }

}
