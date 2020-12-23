// 
// Decompiled by Procyon v0.5.36
// 

package cover;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Password extends JFrame
{
    private JPanel contentPane;
    private JPasswordField passwordField;
    private static int i;
    
    static {
        Password.i = 2;
    }
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Password frame = new Password();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Password() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 847, 540);
        (this.contentPane = new JPanel()).setBackground(new Color(0, 0, 51));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblPin = new JLabel("PIN");
        lblPin.setForeground(Color.WHITE);
        lblPin.setOpaque(true);
        lblPin.setBackground(new Color(0, 0, 51));
        lblPin.setFont(new Font("Times New Roman", 3, 30));
        lblPin.setHorizontalAlignment(0);
        lblPin.setBounds(89, 196, 75, 32);
        this.contentPane.add(lblPin);
        (this.passwordField = new JPasswordField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    final String string = new String(Password.this.passwordField.getPassword());
                    if (string.equals("3.141592654")) {
                        final Cover frame = new Cover();
                        frame.setVisible(true);
                        Password.this.dispose();
                    }
                    else if (Password.i == 0) {
                        JOptionPane.showMessageDialog(Password.this.contentPane, "Wrong Password! ", "WARNING", 2);
                        System.exit(3);
                    }
                    else {
                        final JPanel access$2 = Password.this.contentPane;
                        final StringBuilder sb = new StringBuilder("Wrong Password! ");
                        final int access$3 = Password.i;
                        Password.access$3(access$3 - 1);
                        JOptionPane.showMessageDialog(access$2, sb.append(access$3).append(" Chances left!!").toString(), "WARNING", 2);
                    }
                }
            }
        });
        this.passwordField.setFont(new Font("Times New Roman", 1, 25));
        this.passwordField.setBounds(174, 196, 251, 32);
        this.contentPane.add(this.passwordField);
        final JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
        chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
        chckbxNewCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (chckbxNewCheckBox.isSelected()) {
                    Password.this.passwordField.setEchoChar('\0');
                }
                else {
                    Password.this.passwordField.setEchoChar('*');
                }
            }
        });
        chckbxNewCheckBox.setFont(new Font("Times New Roman", 2, 20));
        chckbxNewCheckBox.setBounds(174, 247, 170, 23);
        this.contentPane.add(chckbxNewCheckBox);
        final JLabel lblNewLabel = new JLabel("");
        final Image img = new ImageIcon(this.getClass().getResource("/tour.gif")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));
        lblNewLabel.setBounds(457, -37, 364, 578);
        this.contentPane.add(lblNewLabel);
    }
    
    static /* synthetic */ void access$3(final int i) {
        Password.i = i;
    }
}
