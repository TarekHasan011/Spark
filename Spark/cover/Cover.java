// 
// Decompiled by Procyon v0.5.36
// 

package cover;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Intro.Introduction;
import Time.Time;
import calculator.Calculator;
import Contact_List.ContactMenu;
import pro.EndeMenu;
import java.awt.Component;
import java.awt.Font;
import chat.ChatMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Cover extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Cover frame = new Cover();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Cover() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 977, 768);
        (this.contentPane = new JPanel()).setBackground(Color.BLACK);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton btnMulti = new JButton("Multi Chat");
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final ChatMenu frame = new ChatMenu();
                frame.setVisible(true);
                Cover.this.dispose();
            }
        });
        btnMulti.setFont(new Font("Times New Roman", 3, 40));
        btnMulti.setBounds(580, 42, 330, 86);
        this.contentPane.add(btnMulti);
        final JButton btnEmail = new JButton("Email");
        btnEmail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final EndeMenu frame = new EndeMenu();
                frame.setVisible(true);
                Cover.this.dispose();
            }
        });
        btnEmail.setFont(new Font("Times New Roman", 3, 40));
        btnEmail.setBounds(580, 149, 330, 86);
        this.contentPane.add(btnEmail);
        final JButton btnContacts = new JButton("Contacts");
        btnContacts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ContactMenu frame = new ContactMenu();
                frame.setVisible(true);
                ContactMenu.ReadFromFile();
                Cover.this.dispose();
            }
        });
        btnContacts.setFont(new Font("Times New Roman", 3, 40));
        btnContacts.setBounds(580, 261, 330, 86);
        this.contentPane.add(btnContacts);
        final JButton btnCalculator = new JButton("Calculator");
        btnCalculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Calculator.main(null);
            }
        });
        btnCalculator.setFont(new Font("Times New Roman", 3, 40));
        btnCalculator.setBounds(580, 374, 330, 86);
        this.contentPane.add(btnCalculator);
        final JButton btnTime = new JButton("Time");
        btnTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Time.main(null);
            }
        });
        btnTime.setFont(new Font("Times New Roman", 3, 40));
        btnTime.setBounds(580, 486, 330, 86);
        this.contentPane.add(btnTime);
        final JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Introduction frame = new Introduction();
                frame.setVisible(true);
                Cover.this.dispose();
            }
        });
        btnExit.setFont(new Font("Times New Roman", 3, 40));
        btnExit.setBounds(580, 593, 330, 86);
        this.contentPane.add(btnExit);
        final JLabel lblNewLabel = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/multichat.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));
        lblNewLabel.setBounds(460, 42, 99, 86);
        this.contentPane.add(lblNewLabel);
        final JLabel label = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/email.png")).getImage();
        label.setIcon(new ImageIcon(img));
        label.setBounds(460, 149, 99, 86);
        this.contentPane.add(label);
        final JLabel label_1 = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/contacts.png")).getImage();
        label_1.setIcon(new ImageIcon(img));
        label_1.setBounds(460, 261, 99, 86);
        this.contentPane.add(label_1);
        final JLabel label_2 = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/calculator.png")).getImage();
        label_2.setIcon(new ImageIcon(img));
        label_2.setBounds(460, 374, 99, 86);
        this.contentPane.add(label_2);
        final JLabel label_3 = new JLabel("");
        label_3.setOpaque(true);
        label_3.setBackground(Color.GRAY);
        img = new ImageIcon(this.getClass().getResource("/ttime.png")).getImage();
        label_3.setIcon(new ImageIcon(img));
        label_3.setBounds(460, 486, 82, 86);
        this.contentPane.add(label_3);
        final JLabel label_4 = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
        label_4.setIcon(new ImageIcon(img));
        label_4.setBounds(460, 593, 99, 86);
        this.contentPane.add(label_4);
        final JLabel label_5 = new JLabel("New label");
        img = new ImageIcon(this.getClass().getResource("/Hacker.gif")).getImage();
        label_5.setIcon(new ImageIcon(img));
        label_5.setBounds(82, 149, 306, 423);
        this.contentPane.add(label_5);
    }
}
