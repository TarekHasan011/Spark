// 
// Decompiled by Procyon v0.5.36
// 

package calculator;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Simple_Calculator
{
    public static JFrame frame;
    public static JTextField textField;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Simple_Calculator window = new Simple_Calculator();
                    Simple_Calculator.frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Simple_Calculator() {
        this.initialize();
    }
    
    private void initialize() {
        (Simple_Calculator.frame = new JFrame()).setBounds(100, 100, 469, 377);
        Simple_Calculator.frame.setDefaultCloseOperation(3);
        Simple_Calculator.frame.getContentPane().setLayout(null);
        (Simple_Calculator.textField = new JTextField()).setBackground(Color.WHITE);
        Simple_Calculator.textField.setFont(new Font("Times New Roman", 1, 18));
        Simple_Calculator.textField.setBounds(32, 25, 313, 73);
        Simple_Calculator.frame.getContentPane().add(Simple_Calculator.textField);
        Simple_Calculator.textField.setColumns(10);
        Simple_Calculator.textField.setEditable(false);
        final JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "1");
            }
        });
        btn1.setBackground(new Color(153, 153, 153));
        btn1.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", 1, 20));
        btn1.setBounds(32, 166, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn1);
        final JButton btn2 = new JButton("3");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "3");
            }
        });
        btn2.setForeground(Color.BLACK);
        btn2.setFont(new Font("Times New Roman", 1, 20));
        btn2.setBackground(new Color(153, 153, 153));
        btn2.setBounds(277, 166, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn2);
        final JButton btn3 = new JButton("2");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "2");
            }
        });
        btn3.setForeground(Color.BLACK);
        btn3.setFont(new Font("Times New Roman", 1, 20));
        btn3.setBackground(new Color(153, 153, 153));
        btn3.setBounds(159, 166, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn3);
        final JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "4");
            }
        });
        btn4.setForeground(Color.BLACK);
        btn4.setFont(new Font("Times New Roman", 1, 20));
        btn4.setBackground(new Color(153, 153, 153));
        btn4.setBounds(32, 231, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn4);
        final JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "5");
            }
        });
        btn5.setForeground(Color.BLACK);
        btn5.setFont(new Font("Times New Roman", 1, 20));
        btn5.setBackground(new Color(153, 153, 153));
        btn5.setBounds(159, 231, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn5);
        final JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "6");
            }
        });
        btn6.setForeground(Color.BLACK);
        btn6.setFont(new Font("Times New Roman", 1, 20));
        btn6.setBackground(new Color(153, 153, 153));
        btn6.setBounds(277, 231, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn6);
        final JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "7");
            }
        });
        btn7.setForeground(Color.BLACK);
        btn7.setFont(new Font("Times New Roman", 1, 20));
        btn7.setBackground(new Color(153, 153, 153));
        btn7.setBounds(32, 291, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn7);
        final JButton btn8 = new JButton("9");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "9");
            }
        });
        btn8.setForeground(Color.BLACK);
        btn8.setFont(new Font("Times New Roman", 1, 20));
        btn8.setBackground(new Color(153, 153, 153));
        btn8.setBounds(277, 291, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn8);
        final JButton btn9 = new JButton("8");
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "8");
            }
        });
        btn9.setForeground(Color.BLACK);
        btn9.setFont(new Font("Times New Roman", 1, 20));
        btn9.setBackground(new Color(153, 153, 153));
        btn9.setBounds(159, 291, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn9);
        final JButton btnadd = new JButton("+");
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "+");
            }
        });
        btnadd.setBackground(Color.LIGHT_GRAY);
        btnadd.setFont(new Font("Times New Roman", 1, 24));
        btnadd.setBounds(382, 79, 61, 23);
        Simple_Calculator.frame.getContentPane().add(btnadd);
        final JButton btnminus = new JButton("-");
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "-");
            }
        });
        btnminus.setFont(new Font("Times New Roman", 1, 24));
        btnminus.setBackground(Color.LIGHT_GRAY);
        btnminus.setBounds(382, 108, 61, 33);
        Simple_Calculator.frame.getContentPane().add(btnminus);
        final JButton btnmulti = new JButton("*");
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "*");
            }
        });
        btnmulti.setFont(new Font("Times New Roman", 1, 24));
        btnmulti.setBackground(Color.LIGHT_GRAY);
        btnmulti.setBounds(382, 144, 61, 33);
        Simple_Calculator.frame.getContentPane().add(btnmulti);
        final JButton btndiv = new JButton("/");
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "/");
            }
        });
        btndiv.setFont(new Font("Times New Roman", 1, 24));
        btndiv.setBackground(Color.LIGHT_GRAY);
        btndiv.setBounds(382, 185, 61, 33);
        Simple_Calculator.frame.getContentPane().add(btndiv);
        final JButton btndo = new JButton("=");
        btndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                String string = Simple_Calculator.textField.getText();
                if (string.charAt(string.length() - 1) == '+' || string.charAt(string.length() - 1) == '-' || string.charAt(string.length() - 1) == '*' || string.charAt(string.length() - 1) == '/') {
                    JOptionPane.showMessageDialog(Simple_Calculator.frame, "Incomplete Expression", "Invalid", 2);
                }
                int flag = 0;
                String regex = "";
                if (string.contains("+")) {
                    regex = String.valueOf(regex) + "+";
                    string = string.replace('+', '_');
                    flag = 1;
                }
                else if (string.contains("-")) {
                    regex = String.valueOf(regex) + "-";
                    string = string.replace('-', '_');
                    flag = 2;
                }
                else if (string.contains("*")) {
                    regex = String.valueOf(regex) + "*";
                    string = string.replace('*', '_');
                    flag = 3;
                }
                else if (string.contains("/")) {
                    flag = 4;
                }
                regex = String.valueOf(regex) + "/";
                string = string.replace('/', '_');
                flag = 4;
                double sum = 0.0;
                if (flag != 0) {
                    final String[] arr = string.split("_");
                    if (regex.equals("+/")) {
                        sum = Double.parseDouble(arr[0]) + Double.parseDouble(arr[1]);
                    }
                    if (regex.equals("-/")) {
                        sum = Double.parseDouble(arr[0]) - Double.parseDouble(arr[1]);
                    }
                    if (regex.equals("*/")) {
                        sum = Double.parseDouble(arr[0]) * Double.parseDouble(arr[1]);
                    }
                    if (regex.equals("/")) {
                        sum = Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]);
                    }
                    Simple_Calculator.textField.setText("The result is : " + sum);
                }
                else {
                    JOptionPane.showMessageDialog(Simple_Calculator.frame, "Incomplete Expression", "Invalid", 2);
                }
            }
        });
        btndo.setFont(new Font("Times New Roman", 1, 24));
        btndo.setBackground(Color.LIGHT_GRAY);
        btndo.setBounds(382, 230, 61, 33);
        Simple_Calculator.frame.getContentPane().add(btndo);
        final JButton btnc = new JButton("C");
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(null);
            }
        });
        btnc.setBackground(Color.WHITE);
        btnc.setFont(new Font("Tahoma", 1, 24));
        btnc.setBounds(382, 25, 61, 39);
        Simple_Calculator.frame.getContentPane().add(btnc);
        final JButton btn10 = new JButton("0");
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Simple_Calculator.textField.setText(String.valueOf(Simple_Calculator.textField.getText()) + "0");
            }
        });
        btn10.setForeground(Color.BLACK);
        btn10.setFont(new Font("Times New Roman", 1, 20));
        btn10.setBackground(new Color(153, 153, 153));
        btn10.setBounds(375, 291, 68, 33);
        Simple_Calculator.frame.getContentPane().add(btn10);
    }
}
