// 
// Decompiled by Procyon v0.5.36
// 

package Contact_List;

import java.awt.TextArea;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Edit extends JFrame
{
    private JPanel contentPane;
    private JTextField name_field;
    private JTextField email;
    private JTextField phonenumber;
    private JTextField occupation;
    private JTextField university;
    private JTextField address;
    public static int change;
    
    static {
        Edit.change = 0;
    }
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Edit frame = new Edit();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Edit() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 901, 652);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setBackground(new Color(0, 204, 255));
        panel.setBounds(0, 0, 885, 610);
        this.contentPane.add(panel);
        final JLabel label = new JLabel("Name");
        label.setFont(new Font("Times New Roman", 1, 25));
        label.setBounds(42, 33, 80, 33);
        panel.add(label);
        (this.name_field = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.name_field.setColumns(10);
        this.name_field.setBounds(117, 33, 367, 33);
        panel.add(this.name_field);
        final JButton button = new JButton("Search");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (ContactMenu.namelist.contains(Edit.this.name_field.getText())) {
                    int i = 0;
                    for (final Contact contact : ContactMenu.arrayList) {
                        if (contact.name.equals(Edit.this.name_field.getText())) {
                            Edit.this.email.setText(contact.email);
                            Edit.this.address.setText(contact.address);
                            Edit.this.university.setText(contact.university);
                            Edit.this.phonenumber.setText(contact.phoneNumber);
                            Edit.this.occupation.setText(contact.occupation);
                            Edit.change = i;
                            break;
                        }
                        ++i;
                    }
                }
                else {
                    JOptionPane.showMessageDialog(Edit.this.contentPane, "Not Exist", "Not Found", 2);
                }
            }
        });
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Times New Roman", 1, 27));
        button.setBackground(new Color(0, 0, 128));
        button.setBounds(153, 77, 128, 33);
        panel.add(button);
        final TextArea suggestionArea = new TextArea();
        suggestionArea.setFont(new Font("Times New Roman", 1, 20));
        suggestionArea.setEditable(false);
        suggestionArea.setBackground(Color.WHITE);
        suggestionArea.setBounds(522, 77, 353, 523);
        panel.add(suggestionArea);
        final JButton button_1 = new JButton("Suggest");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                boolean flag = true;
                suggestionArea.setText("");
                for (final String name : ContactMenu.namelist) {
                    if (name.contains(Edit.this.name_field.getText())) {
                        suggestionArea.setText(String.valueOf(suggestionArea.getText()) + name + "\r\n");
                        flag = false;
                    }
                }
                if (flag) {
                    suggestionArea.setText("Not exist");
                }
            }
        });
        button_1.setForeground(Color.WHITE);
        button_1.setFont(new Font("Times New Roman", 1, 27));
        button_1.setBackground(new Color(0, 0, 128));
        button_1.setBounds(308, 77, 128, 33);
        panel.add(button_1);
        final JLabel label_1 = new JLabel("Suggestion Box");
        label_1.setForeground(Color.BLUE);
        label_1.setFont(new Font("Times New Roman", 1, 25));
        label_1.setBounds(600, 33, 189, 33);
        panel.add(label_1);
        final JLabel label_2 = new JLabel("E-mail Address");
        label_2.setFont(new Font("Times New Roman", 1, 20));
        label_2.setBounds(10, 218, 142, 33);
        panel.add(label_2);
        final JLabel label_3 = new JLabel("Phone Number");
        label_3.setFont(new Font("Times New Roman", 1, 20));
        label_3.setBounds(10, 262, 142, 33);
        panel.add(label_3);
        final JLabel label_4 = new JLabel("Occupation");
        label_4.setFont(new Font("Times New Roman", 1, 20));
        label_4.setBounds(10, 306, 142, 33);
        panel.add(label_4);
        final JButton button_2 = new JButton("Show All");
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                boolean flag = true;
                suggestionArea.setText("");
                for (final String name : ContactMenu.namelist) {
                    suggestionArea.setText(String.valueOf(suggestionArea.getText()) + name + "\r\n");
                    flag = false;
                }
                if (flag) {
                    suggestionArea.setText("No name exist");
                }
            }
        });
        button_2.setForeground(Color.WHITE);
        button_2.setFont(new Font("Times New Roman", 1, 27));
        button_2.setBackground(new Color(0, 0, 128));
        button_2.setBounds(226, 121, 142, 33);
        panel.add(button_2);
        final JLabel label_5 = new JLabel("University");
        label_5.setFont(new Font("Times New Roman", 1, 20));
        label_5.setBounds(10, 354, 142, 33);
        panel.add(label_5);
        final JLabel label_6 = new JLabel("Address");
        label_6.setFont(new Font("Times New Roman", 1, 20));
        label_6.setBounds(10, 398, 142, 33);
        panel.add(label_6);
        (this.email = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.email.setColumns(10);
        this.email.setBounds(149, 218, 367, 33);
        panel.add(this.email);
        (this.phonenumber = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.phonenumber.setColumns(10);
        this.phonenumber.setBounds(149, 262, 367, 33);
        panel.add(this.phonenumber);
        (this.occupation = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.occupation.setColumns(10);
        this.occupation.setBounds(149, 306, 367, 33);
        panel.add(this.occupation);
        (this.university = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.university.setColumns(10);
        this.university.setBounds(149, 354, 367, 33);
        panel.add(this.university);
        (this.address = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.address.setColumns(10);
        this.address.setBounds(149, 398, 367, 33);
        panel.add(this.address);
        final JButton button_3 = new JButton("Back");
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ContactMenu frame = new ContactMenu();
                frame.setVisible(true);
                ContactMenu.ReadFromFile();
                Edit.this.dispose();
            }
        });
        button_3.setFont(new Font("Times New Roman", 1, 27));
        button_3.setBackground(Color.CYAN);
        button_3.setBounds(206, 531, 207, 33);
        panel.add(button_3);
        final JButton save = new JButton("Save Changes");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final int n = JOptionPane.showConfirmDialog(Edit.this.contentPane, "Save changes?");
                if (n == 0) {
                    if (Edit.this.name_field.getText().equals("") || Edit.this.phonenumber.getText().equals("") || Edit.this.email.getText().equals("") || Edit.this.university.getText().equals("") || Edit.this.occupation.getText().equals("") || Edit.this.address.getText().equals("")) {
                        JOptionPane.showMessageDialog(Edit.this.contentPane, "All fields Required", "Required", 2);
                    }
                    else {
                        final Contact contact = ContactMenu.arrayList.get(Edit.change);
                        ContactMenu.arrayList.remove(Edit.change);
                        contact.email = Edit.this.email.getText();
                        contact.phoneNumber = Edit.this.phonenumber.getText();
                        contact.address = Edit.this.address.getText();
                        contact.university = Edit.this.university.getText();
                        contact.address = Edit.this.address.getText();
                        ContactMenu.arrayList.add(Edit.change, contact);
                        ContactMenu.WriteInFile();
                        Edit.this.name_field.setText("");
                        Edit.this.phonenumber.setText("");
                        Edit.this.email.setText("");
                        Edit.this.address.setText("");
                        Edit.this.university.setText("");
                        Edit.this.occupation.setText("");
                    }
                }
            }
        });
        save.setBackground(new Color(51, 255, 0));
        save.setFont(new Font("Times New Roman", 1, 25));
        save.setBounds(213, 482, 189, 38);
        panel.add(save);
    }
}
