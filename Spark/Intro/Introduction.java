// 
// Decompiled by Procyon v0.5.36
// 

package Intro;

import javax.swing.border.LineBorder;
import cover.Cover;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Introduction extends JFrame
{
    private JPanel contentPane;
    private JTextField txtThisProgramIs;
    private JTextField txtMdTarekHasan;
    private JTextField txtStudent;
    private JTextField txtComputerScienceAnd;
    private JTextField txtUnitedInternationalUniversity;
    private JTextField txtHitLikeIf;
    private JLabel lblNewLabel;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Introduction frame = new Introduction();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Introduction() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1008, 764);
        (this.contentPane = new JPanel()).setBackground(Color.BLACK);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Image img = new ImageIcon(this.getClass().getResource("/likes.png")).getImage();
                btnNewButton.setIcon(new ImageIcon(img));
                JOptionPane.showMessageDialog(Introduction.this.contentPane, "Thank you!!");
            }
        });
        Image img = new ImageIcon(this.getClass().getResource("/like.png")).getImage();
        btnNewButton.setIcon(new ImageIcon(img));
        btnNewButton.setFont(new Font("Times New Roman", 3, 50));
        btnNewButton.setBounds(142, 361, 292, 170);
        this.contentPane.add(btnNewButton);
        final JButton btnReadMail = new JButton("");
        btnReadMail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Image img = new ImageIcon(this.getClass().getResource("/dislikes.png")).getImage();
                btnReadMail.setIcon(new ImageIcon(img));
                JOptionPane.showMessageDialog(Introduction.this.contentPane, "Thank you!! I am developing it!!");
            }
        });
        img = new ImageIcon(this.getClass().getResource("/dislike.png")).getImage();
        btnReadMail.setIcon(new ImageIcon(img));
        btnReadMail.setFont(new Font("Times New Roman", 3, 50));
        btnReadMail.setBounds(550, 361, 292, 170);
        this.contentPane.add(btnReadMail);
        final JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Cover frame = new Cover();
                frame.setVisible(true);
                Introduction.this.dispose();
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
        (this.txtThisProgramIs = new JTextField()).setBorder(null);
        this.txtThisProgramIs.setEditable(false);
        this.txtThisProgramIs.setBackground(Color.BLACK);
        this.txtThisProgramIs.setForeground(Color.WHITE);
        this.txtThisProgramIs.setFont(new Font("Times New Roman", 3, 20));
        this.txtThisProgramIs.setText("This Program is Developed By :");
        this.txtThisProgramIs.setBounds(142, 26, 292, 33);
        this.contentPane.add(this.txtThisProgramIs);
        this.txtThisProgramIs.setColumns(10);
        (this.txtMdTarekHasan = new JTextField()).setBorder(null);
        this.txtMdTarekHasan.setForeground(Color.WHITE);
        this.txtMdTarekHasan.setBackground(Color.BLACK);
        this.txtMdTarekHasan.setEditable(false);
        this.txtMdTarekHasan.setText("Md. Tarek Hasan");
        this.txtMdTarekHasan.setFont(new Font("Times New Roman", 3, 20));
        this.txtMdTarekHasan.setColumns(10);
        this.txtMdTarekHasan.setBounds(312, 70, 324, 33);
        this.contentPane.add(this.txtMdTarekHasan);
        (this.txtStudent = new JTextField()).setBorder(null);
        this.txtStudent.setBackground(Color.BLACK);
        this.txtStudent.setForeground(Color.WHITE);
        this.txtStudent.setEditable(false);
        this.txtStudent.setText("Student (Student ID: 011 181 076)");
        this.txtStudent.setFont(new Font("Times New Roman", 3, 20));
        this.txtStudent.setColumns(10);
        this.txtStudent.setBounds(312, 114, 324, 33);
        this.contentPane.add(this.txtStudent);
        (this.txtComputerScienceAnd = new JTextField()).setBorder(null);
        this.txtComputerScienceAnd.setBackground(Color.BLACK);
        this.txtComputerScienceAnd.setForeground(Color.WHITE);
        this.txtComputerScienceAnd.setEditable(false);
        this.txtComputerScienceAnd.setText("Computer Science and Engineering");
        this.txtComputerScienceAnd.setFont(new Font("Times New Roman", 3, 20));
        this.txtComputerScienceAnd.setColumns(10);
        this.txtComputerScienceAnd.setBounds(312, 158, 324, 33);
        this.contentPane.add(this.txtComputerScienceAnd);
        (this.txtUnitedInternationalUniversity = new JTextField()).setBorder(null);
        this.txtUnitedInternationalUniversity.setBackground(Color.BLACK);
        this.txtUnitedInternationalUniversity.setForeground(Color.WHITE);
        this.txtUnitedInternationalUniversity.setEditable(false);
        this.txtUnitedInternationalUniversity.setText("United International University");
        this.txtUnitedInternationalUniversity.setFont(new Font("Times New Roman", 3, 20));
        this.txtUnitedInternationalUniversity.setColumns(10);
        this.txtUnitedInternationalUniversity.setBounds(312, 202, 324, 33);
        this.contentPane.add(this.txtUnitedInternationalUniversity);
        (this.txtHitLikeIf = new JTextField()).setEditable(false);
        this.txtHitLikeIf.setBorder(new LineBorder(new Color(0, 0, 0)));
        this.txtHitLikeIf.setForeground(Color.BLACK);
        this.txtHitLikeIf.setBackground(new Color(0, 255, 255));
        this.txtHitLikeIf.setHorizontalAlignment(0);
        this.txtHitLikeIf.setFont(new Font("Times New Roman", 1, 33));
        this.txtHitLikeIf.setText("HIT LIKE IF YOU LIKE THIS WORK");
        this.txtHitLikeIf.setBounds(142, 260, 700, 71);
        this.contentPane.add(this.txtHitLikeIf);
        this.txtHitLikeIf.setColumns(10);
        this.lblNewLabel = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/trk.png")).getImage();
        this.lblNewLabel.setIcon(new ImageIcon(img));
        this.lblNewLabel.setBackground(Color.BLACK);
        this.lblNewLabel.setBounds(142, 70, 202, 165);
        this.contentPane.add(this.lblNewLabel);
        img = new ImageIcon(this.getClass().getResource("/mail.png")).getImage();
    }
}
