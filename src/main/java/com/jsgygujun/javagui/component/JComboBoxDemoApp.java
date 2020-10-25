package com.jsgygujun.javagui.component;

import javax.swing.*;

/**
 * JComboBox: 下拉列表组件
 * 下拉列表的特点是将多个选项折叠在一起，只显示最前面的或被选中的一个
 *
 * 下拉列表由 JComboBox 类实现，常用构造方法如下。
 * JComboBox()：                     创建一个空的 JComboBox 对象。
 * JComboBox(ComboBoxModel aModel)： 创建一个 JComboBox，其选项取自现有的 ComboBoxModel。
 * JComboBox(Object[] items)：       创建包含指定数组中元素的 JComboBox。
 *
 * 常用方法：
 * 方法名称	                                        说明
 * void addItem(Object anObject)	                将指定的对象作为选项添加到下拉列表框中
 * void insertItemAt(Object anObject,int index)	    在下拉列表框中的指定索引处插入项
 * void removeItem(Object anObject)	                在下拉列表框中删除指定的对象项
 * void removeItemAt(int anIndex)	                在下拉列表框中删除指定位置的对象项
 * void removeAllItems()	                        从下拉列表框中删除所有项
 * int getItemCount()	                            返回下拉列表框中的项数
 * Object getItemAt(int index)	                    获取指定索引的列表项，索引从 0 开始
 * int getSelectedIndex()	                        获取当前选择的索引
 * Object getSelectedItem()	                        获取当前选择的项
 *
 * @author GuJun
 * @date 2020/10/25
 */
public class JComboBoxDemoApp {

    private final JFrame frame = new JFrame("Java 下拉列表组件示例");
    private final JPanel panel = new JPanel();
    private final JLabel label = new JLabel("证件类型");
    private final JComboBox<String> cb = new JComboBox<>();
    private final JButton button = new JButton("Clip");

    private void layout() {
        panel.add(label);
        panel.add(cb);
        panel.add(button);

        frame.add(panel);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        cb.addItem("--请选择--");
        cb.addItem("身份证");
        cb.addItem("驾驶证");
        cb.addItem("军官证");
        cb.addActionListener((e) -> {

        });

        button.addActionListener((e) -> {
            System.out.println(cb.getSelectedItem());
        });
    }

    public JComboBoxDemoApp() {
        layout();
        init();
    }

    public static void main(String[] args) {
        new JComboBoxDemoApp();
    }
}
