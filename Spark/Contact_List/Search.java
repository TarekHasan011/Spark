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
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Search extends JFrame
{
    private JPanel contentPane;
    private JTextField name_field;
    private JTextField email;
    private JTextField phone;
    private JTextField occupation;
    private JTextField university;
    private JTextField address;
    private TextArea suggestionArea;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Search frame = new Search();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Search() {
        this.suggestionArea = new TextArea();
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 901, 652);
        (this.contentPane = new JPanel()).setBackground(new Color(0, 204, 255));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Times New Roman", 1, 25));
        lblName.setBounds(42, 33, 80, 33);
        this.contentPane.add(lblName);
        (this.name_field = new JTextField()).setFont(new Font("Times New Roman", 0, 25));
        this.name_field.setColumns(10);
        this.name_field.setBounds(117, 33, 367, 33);
        this.contentPane.add(this.name_field);
        final JButton searchbtn = new JButton("Search");
        searchbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (ContactMenu.namelist.contains(Search.this.name_field.getText())) {
                    for (final Contact contact : ContactMenu.arrayList) {
                        if (contact.name.equals(Search.this.name_field.getText())) {
                            Search.this.email.setText(contact.email);
                            Search.this.address.setText(contact.address);
                            Search.this.university.setText(contact.university);
                            Search.this.phone.setText(contact.phoneNumber);
                            Search.this.occupation.setText(contact.occupation);
                            break;
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(Search.this.contentPane, "Not Exist", "Not Found", 2);
                }
            }
        });
        searchbtn.setForeground(Color.WHITE);
        searchbtn.setFont(new Font("Times New Roman", 1, 27));
        searchbtn.setBackground(new Color(0, 0, 128));
        searchbtn.setBounds(153, 77, 128, 33);
        this.contentPane.add(searchbtn);
        this.suggestionArea.setFont(new Font("Times New Roman", 1, 20));
        this.suggestionArea.setBackground(Color.WHITE);
        this.suggestionArea.setEditable(false);
        this.suggestionArea.setBounds(522, 77, 353, 523);
        this.contentPane.add(this.suggestionArea);
        final JButton btnSuggest = new JButton("Suggest");
        btnSuggest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                boolean flag = true;
                Search.this.suggestionArea.setText("");
                for (final String name : ContactMenu.namelist) {
                    if (name.contains(Search.this.name_field.getText())) {
                        Search.this.suggestionArea.setText(String.valueOf(Search.this.suggestionArea.getText()) + name + "\r\n");
                        flag = false;
                    }
                }
                if (flag) {
                    Search.this.suggestionArea.setText("Not exist");
                }
            }
        });
        btnSuggest.setForeground(Color.WHITE);
        btnSuggest.setFont(new Font("Times New Roman", 1, 27));
        btnSuggest.setBackground(new Color(0, 0, 128));
        btnSuggest.setBounds(308, 77, 128, 33);
        this.contentPane.add(btnSuggest);
        final JLabel lblSuggestionBox = new JLabel("Suggestion Box");
        lblSuggestionBox.setForeground(Color.BLUE);
        lblSuggestionBox.setFont(new Font("Times New Roman", 1, 25));
        lblSuggestionBox.setBounds(600, 33, 189, 33);
        this.contentPane.add(lblSuggestionBox);
        final JLabel label = new JLabel("E-mail Address");
        label.setFont(new Font("Times New Roman", 1, 20));
        label.setBounds(10, 218, 142, 33);
        this.contentPane.add(label);
        final JLabel lblPhoneNumber = new JLabel("Phone Number");
        lblPhoneNumber.setFont(new Font("Times New Roman", 1, 20));
        lblPhoneNumber.setBounds(10, 262, 142, 33);
        this.contentPane.add(lblPhoneNumber);
        final JLabel lblOccupation = new JLabel("Occupation");
        lblOccupation.setFont(new Font("Times New Roman", 1, 20));
        lblOccupation.setBounds(10, 306, 142, 33);
        this.contentPane.add(lblOccupation);
        final JButton ShowAllbtn = new JButton("Show All");
        ShowAllbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                boolean flag = true;
                Search.this.suggestionArea.setText("");
                for (final String name : ContactMenu.namelist) {
                    Search.this.suggestionArea.setText(String.valueOf(Search.this.suggestionArea.getText()) + name + "\r\n");
                    flag = false;
                }
                if (flag) {
                    Search.this.suggestionArea.setText("No name exist");
                }
            }
        });
        ShowAllbtn.setForeground(Color.WHITE);
        ShowAllbtn.setFont(new Font("Times New Roman", 1, 27));
        ShowAllbtn.setBackground(new Color(0, 0, 128));
        ShowAllbtn.setBounds(226, 121, 142, 33);
        this.contentPane.add(ShowAllbtn);
        final JLabel lblUniversity = new JLabel("University");
        lblUniversity.setFont(new Font("Times New Roman", 1, 20));
        lblUniversity.setBounds(10, 354, 142, 33);
        this.contentPane.add(lblUniversity);
        final JLabel lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("Times New Roman", 1, 20));
        lblAddress.setBounds(10, 398, 142, 33);
        this.contentPane.add(lblAddress);
        (this.email = new JTextField()).setEditable(false);
        this.email.setFont(new Font("Times New Roman", 0, 25));
        this.email.setColumns(10);
        this.email.setBounds(149, 218, 367, 33);
        this.contentPane.add(this.email);
        (this.phone = new JTextField()).setEditable(false);
        this.phone.setFont(new Font("Times New Roman", 0, 25));
        this.phone.setColumns(10);
        this.phone.setBounds(149, 262, 367, 33);
        this.contentPane.add(this.phone);
        (this.occupation = new JTextField()).setEditable(false);
        this.occupation.setFont(new Font("Times New Roman", 0, 25));
        this.occupation.setColumns(10);
        this.occupation.setBounds(149, 306, 367, 33);
        this.contentPane.add(this.occupation);
        (this.university = new JTextField()).setEditable(false);
        this.university.setFont(new Font("Times New Roman", 0, 25));
        this.university.setColumns(10);
        this.university.setBounds(149, 354, 367, 33);
        this.contentPane.add(this.university);
        (this.address = new JTextField()).setEditable(false);
        this.address.setFont(new Font("Times New Roman", 0, 25));
        this.address.setColumns(10);
        this.address.setBounds(149, 398, 367, 33);
        this.contentPane.add(this.address);
        final JButton button = new JButton("Back");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final ContactMenu frame = new ContactMenu();
                frame.setVisible(true);
                ContactMenu.ReadFromFile();
                Search.this.dispose();
            }
        });
        button.setFont(new Font("Times New Roman", 1, 27));
        button.setBackground(Color.CYAN);
        button.setBounds(149, 531, 207, 33);
        this.contentPane.add(button);
    }
}
