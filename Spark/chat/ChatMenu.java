// 
// Decompiled by Procyon v0.5.36
// 

package chat;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import cover.Cover;
import java.awt.Component;
import java.awt.Font;
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

public class ChatMenu extends JFrame
{
    private JPanel contentPane;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final ChatMenu frame = new ChatMenu();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public ChatMenu() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1008, 764);
        (this.contentPane = new JPanel()).setBackground(Color.BLACK);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton btnNewButton = new JButton("Friend 1");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Friend1.main(null);
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", 3, 50));
        btnNewButton.setBounds(142, 173, 292, 328);
        this.contentPane.add(btnNewButton);
        final JButton btnReadMail = new JButton("Friend 2");
        btnReadMail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Friend2.main(null);
            }
        });
        btnReadMail.setFont(new Font("Times New Roman", 3, 50));
        btnReadMail.setBounds(550, 173, 292, 328);
        this.contentPane.add(btnReadMail);
        final JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Cover frame = new Cover();
                frame.setVisible(true);
                ChatMenu.this.dispose();
            }
        });
        btnBack.setFont(new Font("Times New Roman", 3, 50));
        btnBack.setBounds(142, 555, 292, 143);
        this.contentPane.add(btnBack);
        final JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                System.exit(3);
            }
        });
        btnExit.setFont(new Font("Times New Roman", 3, 50));
        btnExit.setBounds(550, 555, 292, 143);
        this.contentPane.add(btnExit);
        final JLabel lblARealFriend = new JLabel("A real friend is one who walks in when the rest of the world walks out");
        final Image img = new ImageIcon(this.getClass().getResource("/friend.png")).getImage();
        lblARealFriend.setIcon(new ImageIcon(img));
        lblARealFriend.setHorizontalAlignment(4);
        lblARealFriend.setVerticalAlignment(1);
        lblARealFriend.setForeground(Color.WHITE);
        lblARealFriend.setFont(new Font("Times New Roman", 3, 25));
        lblARealFriend.setBounds(29, 11, 889, 143);
        this.contentPane.add(lblARealFriend);
    }
}
