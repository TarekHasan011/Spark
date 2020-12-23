// 
// Decompiled by Procyon v0.5.36
// 

package Time;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Time
{
    private JFrame frame;
    public static JTextField timeField;
    private JLabel lblNewLabel;
    public static JTextField date_field;
    private JTextField textField;
    private JLabel lblNewLabel_1;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Time window = new Time();
                    window.frame.setVisible(true);
                    final RunnableObjectClass run1 = new RunnableObjectClass();
                    final Thread thread = new Thread(run1);
                    thread.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Time() {
        this.initialize();
    }
    
    private void initialize() {
        this.frame = new JFrame();
        this.frame.getContentPane().setBackground(Color.BLACK);
        this.frame.setBounds(100, 100, 522, 404);
        this.frame.setDefaultCloseOperation(2);
        this.frame.getContentPane().setLayout(null);
        final JLabel lblTheTimeIs = new JLabel("The Time is");
        lblTheTimeIs.setForeground(Color.RED);
        lblTheTimeIs.setHorizontalAlignment(0);
        lblTheTimeIs.setFont(new Font("Times New Roman", 1, 30));
        lblTheTimeIs.setBounds(129, 97, 186, 60);
        this.frame.getContentPane().add(lblTheTimeIs);
        (Time.timeField = new JTextField()).setBackground(Color.LIGHT_GRAY);
        Time.timeField.setForeground(Color.BLACK);
        Time.timeField.setHorizontalAlignment(0);
        Time.timeField.setFont(new Font("Times New Roman", 1, 30));
        Time.timeField.setBounds(119, 156, 232, 77);
        this.frame.getContentPane().add(Time.timeField);
        Time.timeField.setColumns(10);
        Time.timeField.setEditable(false);
        (this.lblNewLabel = new JLabel("Date")).setFont(new Font("Times New Roman", 1, 20));
        this.lblNewLabel.setHorizontalAlignment(0);
        this.lblNewLabel.setForeground(Color.RED);
        this.lblNewLabel.setBounds(47, 47, 73, 31);
        this.frame.getContentPane().add(this.lblNewLabel);
        (Time.date_field = new JTextField()).setFont(new Font("Times New Roman", 1, 20));
        Time.date_field.setHorizontalAlignment(0);
        Time.date_field.setBackground(Color.LIGHT_GRAY);
        Time.date_field.setBounds(119, 47, 221, 39);
        this.frame.getContentPane().add(Time.date_field);
        Time.date_field.setColumns(10);
        Time.date_field.setEditable(false);
        this.lblNewLabel_1 = new JLabel("");
        final Image imgImage = new ImageIcon(this.getClass().getResource("/Time.png")).getImage();
        this.lblNewLabel_1.setIcon(new ImageIcon(imgImage));
        this.lblNewLabel_1.setBounds(391, 249, 105, 90);
        this.frame.getContentPane().add(this.lblNewLabel_1);
    }
}
