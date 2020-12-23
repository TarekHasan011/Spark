// 
// Decompiled by Procyon v0.5.36
// 

package Contact_List;

import java.util.Iterator;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Delete extends JFrame
{
    private JPanel contentPane;
    private JTextField nameField;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Delete frame = new Delete();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Delete() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 701, 514);
        (this.contentPane = new JPanel()).setBackground(new Color(0, 204, 255));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblEnterName = new JLabel("Enter Name");
        lblEnterName.setHorizontalAlignment(0);
        lblEnterName.setFont(new Font("Times New Roman", 1, 25));
        lblEnterName.setBounds(219, 135, 189, 33);
        this.contentPane.add(lblEnterName);
        (this.nameField = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.nameField.setColumns(10);
        this.nameField.setBounds(148, 181, 367, 33);
        this.contentPane.add(this.nameField);
        final JButton btnDelete = new JButton("DELETE");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final int n = JOptionPane.showConfirmDialog(Delete.this.contentPane, "Are you sure you want to delete " + Delete.this.nameField.getText() + " ?");
                if (n == 0) {
                    if (Delete.this.nameField.getText().equals("")) {
                        JOptionPane.showMessageDialog(Delete.this.contentPane, "Name Requied", "Waring", 2);
                    }
                    else if (ContactMenu.namelist.contains(Delete.this.nameField.getText())) {
                        int i = 0;
                        for (final Contact contact : ContactMenu.arrayList) {
                            if (contact.name.equals(Delete.this.nameField.getText())) {
                                break;
                            }
                            ++i;
                        }
                        ContactMenu.arrayList.remove(i);
                        i = 0;
                        for (final String name : ContactMenu.namelist) {
                            if (name.equals(Delete.this.nameField.getText())) {
                                break;
                            }
                            ++i;
                        }
                        ContactMenu.namelist.remove(i);
                        ContactMenu.WriteInFile();
                        JOptionPane.showMessageDialog(Delete.this.contentPane, "Successfully Deleted", "DELETED", -1);
                    }
                    else {
                        JOptionPane.showMessageDialog(Delete.this.contentPane, "Name Doesn't Exist", "NOT FOUND", 2);
                    }
                }
            }
        });
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setFont(new Font("Times New Roman", 1, 25));
        btnDelete.setBackground(Color.RED);
        btnDelete.setBounds(232, 255, 189, 38);
        this.contentPane.add(btnDelete);
        final JButton button = new JButton("Back");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ContactMenu frame = new ContactMenu();
                frame.setVisible(true);
                ContactMenu.ReadFromFile();
                Delete.this.dispose();
            }
        });
        button.setFont(new Font("Times New Roman", 1, 27));
        button.setBackground(Color.CYAN);
        button.setBounds(224, 309, 207, 33);
        this.contentPane.add(button);
    }
}
