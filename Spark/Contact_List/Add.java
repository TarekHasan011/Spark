// 
// Decompiled by Procyon v0.5.36
// 

package Contact_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Add extends JFrame
{
    private JPanel contentPane;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField numberField;
    private JTextField occupationField;
    private JTextField uniField;
    private JTextField addressField;
    
    public void AddtoList() {
        if (ContactMenu.namelist.contains(this.nameField.getText())) {
            JOptionPane.showMessageDialog(this.contentPane, "Name Already Exist", "Unique Name Required", 2);
        }
        else if (this.nameField.getText().equals("") || this.numberField.getText().equals("") || this.emailField.getText().equals("") || this.uniField.getText().equals("") || this.occupationField.getText().equals("") || this.addressField.getText().equals("")) {
            JOptionPane.showMessageDialog(this.contentPane, "All fields Required", "Required", 2);
        }
        else {
            try {
                final BufferedWriter br = new BufferedWriter(new FileWriter(new File("Contact.txt"), true));
                br.append((CharSequence)(String.valueOf(this.nameField.getText()) + "&" + this.emailField.getText() + "&" + this.numberField.getText() + "&" + this.occupationField.getText() + "&" + this.uniField.getText() + "&" + this.addressField.getText() + "\r\n"));
                br.close();
                JOptionPane.showMessageDialog(this.contentPane, "Name Added", "Successfully Added", -1);
                this.nameField.setText("");
                this.numberField.setText("");
                this.uniField.setText("");
                this.emailField.setText("");
                this.occupationField.setText("");
                this.addressField.setText("");
                ContactMenu.arrayList.clear();
                ContactMenu.namelist.clear();
                ContactMenu.ReadFromFile();
            }
            catch (Exception ex) {}
        }
    }
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Add frame = new Add();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Add() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 623, 632);
        (this.contentPane = new JPanel()).setBackground(new Color(0, 191, 255));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setFont(new Font("Times New Roman", 1, 25));
        lblNewLabel.setBounds(23, 64, 80, 33);
        this.contentPane.add(lblNewLabel);
        final JLabel lblEmailAddress = new JLabel("E-mail Address");
        lblEmailAddress.setFont(new Font("Times New Roman", 1, 25));
        lblEmailAddress.setBounds(23, 125, 176, 33);
        this.contentPane.add(lblEmailAddress);
        final JLabel lblPhoneNumber = new JLabel("Phone Number");
        lblPhoneNumber.setFont(new Font("Times New Roman", 1, 25));
        lblPhoneNumber.setBounds(23, 187, 176, 33);
        this.contentPane.add(lblPhoneNumber);
        final JLabel lblOccupation = new JLabel("Occupation");
        lblOccupation.setFont(new Font("Times New Roman", 1, 25));
        lblOccupation.setBounds(23, 244, 164, 33);
        this.contentPane.add(lblOccupation);
        final JLabel lblUniversity = new JLabel("University");
        lblUniversity.setFont(new Font("Times New Roman", 1, 25));
        lblUniversity.setBounds(23, 304, 164, 33);
        this.contentPane.add(lblUniversity);
        final JLabel lblAddess = new JLabel("Addess");
        lblAddess.setFont(new Font("Times New Roman", 1, 25));
        lblAddess.setBounds(23, 358, 164, 33);
        this.contentPane.add(lblAddess);
        (this.nameField = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    Add.this.emailField.requestFocus();
                }
            }
        });
        this.nameField.setFont(new Font("Times New Roman", 0, 25));
        this.nameField.setBounds(213, 64, 367, 33);
        this.contentPane.add(this.nameField);
        this.nameField.setColumns(10);
        (this.emailField = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    Add.this.numberField.requestFocus();
                }
            }
        });
        this.emailField.setFont(new Font("Times New Roman", 0, 25));
        this.emailField.setColumns(10);
        this.emailField.setBounds(213, 125, 367, 33);
        this.contentPane.add(this.emailField);
        (this.numberField = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    Add.this.occupationField.requestFocus();
                }
            }
        });
        this.numberField.setFont(new Font("Times New Roman", 0, 25));
        this.numberField.setColumns(10);
        this.numberField.setBounds(213, 187, 367, 33);
        this.contentPane.add(this.numberField);
        (this.occupationField = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    Add.this.uniField.requestFocus();
                }
            }
        });
        this.occupationField.setFont(new Font("Times New Roman", 0, 25));
        this.occupationField.setColumns(10);
        this.occupationField.setBounds(213, 244, 367, 33);
        this.contentPane.add(this.occupationField);
        (this.uniField = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    Add.this.addressField.requestFocus();
                }
            }
        });
        this.uniField.setFont(new Font("Times New Roman", 0, 25));
        this.uniField.setColumns(10);
        this.uniField.setBounds(213, 304, 367, 33);
        this.contentPane.add(this.uniField);
        (this.addressField = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    Add.this.AddtoList();
                }
            }
        });
        this.addressField.setFont(new Font("Times New Roman", 0, 25));
        this.addressField.setColumns(10);
        this.addressField.setBounds(213, 358, 367, 33);
        this.contentPane.add(this.addressField);
        final JButton btnAddContact = new JButton("Add Contact");
        btnAddContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                Add.this.AddtoList();
            }
        });
        btnAddContact.setBackground(new Color(0, 255, 255));
        btnAddContact.setFont(new Font("Times New Roman", 1, 27));
        btnAddContact.setBounds(192, 480, 207, 33);
        this.contentPane.add(btnAddContact);
        final JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ContactMenu frame = new ContactMenu();
                frame.setVisible(true);
                ContactMenu.ReadFromFile();
                Add.this.dispose();
            }
        });
        back.setFont(new Font("Times New Roman", 1, 27));
        back.setBackground(Color.CYAN);
        back.setBounds(23, 546, 207, 33);
        this.contentPane.add(back);
        final JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.exit(3);
            }
        });
        btnExit.setFont(new Font("Times New Roman", 1, 27));
        btnExit.setBackground(Color.CYAN);
        btnExit.setBounds(373, 546, 207, 33);
        this.contentPane.add(btnExit);
    }
}
