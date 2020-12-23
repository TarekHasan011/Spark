// 
// Decompiled by Procyon v0.5.36
// 

package calculator;

import javax.swing.UIManager;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Calculator
{
    public static JFrame frmCalculator;
    public static JTextField textField;
    public static boolean flag;
    
    static {
        Calculator.flag = true;
    }
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Calculator window = new Calculator();
                    Calculator.frmCalculator.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Calculator() {
        this.initialize();
    }
    
    private void initialize() {
        (Calculator.frmCalculator = new JFrame()).setAlwaysOnTop(true);
        Calculator.frmCalculator.setTitle("Calculator");
        Calculator.frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Tarek\\eclipse-workspace\\Assignment_Calculator\\img\\calc-icon.png"));
        Calculator.frmCalculator.setBounds(100, 100, 469, 377);
        Calculator.frmCalculator.setDefaultCloseOperation(2);
        Calculator.frmCalculator.getContentPane().setLayout(null);
        (Calculator.textField = new JTextField()).setBackground(Color.WHITE);
        Calculator.textField.setFont(new Font("Times New Roman", 1, 18));
        Calculator.textField.setBounds(32, 25, 313, 73);
        Calculator.frmCalculator.getContentPane().add(Calculator.textField);
        Calculator.textField.setColumns(10);
        Calculator.textField.setEditable(false);
        final JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "1");
            }
        });
        btn1.setBackground(new Color(153, 153, 153));
        btn1.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", 1, 20));
        btn1.setBounds(32, 166, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn1);
        final JButton btn2 = new JButton("3");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "3");
            }
        });
        btn2.setForeground(Color.BLACK);
        btn2.setFont(new Font("Times New Roman", 1, 20));
        btn2.setBackground(new Color(153, 153, 153));
        btn2.setBounds(277, 166, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn2);
        final JButton btn3 = new JButton("2");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "2");
            }
        });
        btn3.setForeground(Color.BLACK);
        btn3.setFont(new Font("Times New Roman", 1, 20));
        btn3.setBackground(new Color(153, 153, 153));
        btn3.setBounds(159, 166, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn3);
        final JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "4");
            }
        });
        btn4.setForeground(Color.BLACK);
        btn4.setFont(new Font("Times New Roman", 1, 20));
        btn4.setBackground(new Color(153, 153, 153));
        btn4.setBounds(32, 231, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn4);
        final JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "5");
            }
        });
        btn5.setForeground(Color.BLACK);
        btn5.setFont(new Font("Times New Roman", 1, 20));
        btn5.setBackground(new Color(153, 153, 153));
        btn5.setBounds(159, 231, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn5);
        final JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "6");
            }
        });
        btn6.setForeground(Color.BLACK);
        btn6.setFont(new Font("Times New Roman", 1, 20));
        btn6.setBackground(new Color(153, 153, 153));
        btn6.setBounds(277, 231, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn6);
        final JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "7");
            }
        });
        btn7.setForeground(Color.BLACK);
        btn7.setFont(new Font("Times New Roman", 1, 20));
        btn7.setBackground(new Color(153, 153, 153));
        btn7.setBounds(32, 291, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn7);
        final JButton btn8 = new JButton("9");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "9");
            }
        });
        btn8.setForeground(Color.BLACK);
        btn8.setFont(new Font("Times New Roman", 1, 20));
        btn8.setBackground(new Color(153, 153, 153));
        btn8.setBounds(277, 291, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn8);
        final JButton btn9 = new JButton("8");
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "8");
            }
        });
        btn9.setForeground(Color.BLACK);
        btn9.setFont(new Font("Times New Roman", 1, 20));
        btn9.setBackground(new Color(153, 153, 153));
        btn9.setBounds(159, 291, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn9);
        final JButton btnadd = new JButton("+");
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "+");
            }
        });
        btnadd.setBackground(Color.WHITE);
        btnadd.setFont(new Font("Times New Roman", 1, 28));
        btnadd.setBounds(382, 79, 61, 23);
        Calculator.frmCalculator.getContentPane().add(btnadd);
        final JButton btnminus = new JButton("-");
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "-");
            }
        });
        btnminus.setFont(new Font("Times New Roman", 1, 28));
        btnminus.setBackground(Color.WHITE);
        btnminus.setBounds(382, 108, 61, 33);
        Calculator.frmCalculator.getContentPane().add(btnminus);
        final JButton btnmulti = new JButton("*");
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "*");
            }
        });
        btnmulti.setFont(new Font("Times New Roman", 1, 28));
        btnmulti.setBackground(Color.WHITE);
        btnmulti.setBounds(382, 144, 61, 33);
        Calculator.frmCalculator.getContentPane().add(btnmulti);
        final JButton btndiv = new JButton("/");
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "/");
            }
        });
        btndiv.setFont(new Font("Times New Roman", 1, 28));
        btndiv.setBackground(Color.WHITE);
        btndiv.setBounds(382, 185, 61, 33);
        Calculator.frmCalculator.getContentPane().add(btndiv);
        final JButton btndo = new JButton("=");
        btndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String string = Calculator.textField.getText();
                if (string.charAt(string.length() - 1) == '+' || string.charAt(string.length() - 1) == '-' || string.charAt(string.length() - 1) == '*' || string.charAt(string.length() - 1) == '/') {
                    JOptionPane.showMessageDialog(Calculator.frmCalculator, "Incomplete Expression", "Invalid", 2);
                }
                else {
                    final String saveString = string;
                    final Converter expression = new Converter(string);
                    Calculator.textField.setText(null);
                    Calculator.textField.setText("The result is : " + expression.calculate());
                    final int n = JOptionPane.showConfirmDialog(Calculator.frmCalculator, "Want to see the Expression?", "Expression", 1);
                    if (n == 0) {
                        JOptionPane.showMessageDialog(Calculator.frmCalculator, saveString, "Expression", -1);
                    }
                }
            }
        });
        btndo.setFont(new Font("Times New Roman", 1, 30));
        btndo.setBackground(Color.WHITE);
        btndo.setBounds(382, 230, 61, 33);
        Calculator.frmCalculator.getContentPane().add(btndo);
        final JButton btnc = new JButton("C");
        btnc.setForeground(Color.WHITE);
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(null);
            }
        });
        btnc.setBackground(Color.BLUE);
        btnc.setFont(new Font("Tahoma", 1, 24));
        btnc.setBounds(32, 109, 68, 39);
        Calculator.frmCalculator.getContentPane().add(btnc);
        final JButton btn10 = new JButton("0");
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + "0");
            }
        });
        btn10.setForeground(Color.BLACK);
        btn10.setFont(new Font("Times New Roman", 1, 20));
        btn10.setBackground(new Color(153, 153, 153));
        btn10.setBounds(375, 291, 68, 33);
        Calculator.frmCalculator.getContentPane().add(btn10);
        final JButton btndot = new JButton(".");
        btndot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.textField.setText(String.valueOf(Calculator.textField.getText()) + ".");
            }
        });
        btndot.setForeground(Color.BLACK);
        btndot.setFont(new Font("Times New Roman", 1, 33));
        btndot.setBackground(new Color(153, 153, 153));
        btndot.setBounds(382, 39, 61, 33);
        Calculator.frmCalculator.getContentPane().add(btndot);
        final JButton btnDel = new JButton("DEL");
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final StringBuilder sBuilder = new StringBuilder(Calculator.textField.getText());
                sBuilder.deleteCharAt(sBuilder.length() - 1);
                Calculator.textField.setText(sBuilder.toString());
            }
        });
        btnDel.setForeground(Color.WHITE);
        btnDel.setFont(new Font("Tahoma", 1, 16));
        btnDel.setBackground(Color.BLUE);
        btnDel.setBounds(277, 109, 68, 39);
        Calculator.frmCalculator.getContentPane().add(btnDel);
        final JButton btnMode = new JButton("Dark Mode");
        btnMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (Calculator.flag) {
                    Calculator.frmCalculator.getContentPane().setBackground(Color.BLACK);
                    btnMode.setText("Light Mode");
                    btnMode.setBackground(Color.WHITE);
                    btnMode.setForeground(Color.BLACK);
                    Calculator.flag = false;
                }
                else {
                    Calculator.frmCalculator.getContentPane().setBackground(UIManager.getColor("Button.background"));
                    btnMode.setText("Dark Mode");
                    btnMode.setBackground(Color.BLACK);
                    btnMode.setForeground(Color.WHITE);
                    Calculator.flag = true;
                }
            }
        });
        btnMode.setBackground(Color.BLACK);
        btnMode.setForeground(Color.WHITE);
        btnMode.setFont(new Font("Times New Roman", 1, 14));
        btnMode.setBounds(141, 119, 106, 23);
        Calculator.frmCalculator.getContentPane().add(btnMode);
    }
}
