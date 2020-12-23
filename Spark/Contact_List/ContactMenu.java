// 
// Decompiled by Procyon v0.5.36
// 

package Contact_List;

import java.awt.Image;
import cover.Cover;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class ContactMenu extends JFrame
{
    private JPanel contentPane;
    public static ArrayList<Contact> arrayList;
    public static ArrayList<String> namelist;
    
    static {
        ContactMenu.arrayList = new ArrayList<Contact>();
        ContactMenu.namelist = new ArrayList<String>();
    }
    
    public static void ReadFromFile() {
        try {
            ContactMenu.arrayList.clear();
            ContactMenu.namelist.clear();
            final BufferedReader br = new BufferedReader(new FileReader("Contact.txt"));
            for (String string = br.readLine(); string != null; string = br.readLine()) {
                final Contact tempContact = new Contact(string);
                ContactMenu.arrayList.add(tempContact);
                ContactMenu.namelist.add(tempContact.name);
            }
            br.close();
            Collections.sort(ContactMenu.arrayList, new NameComparator());
            Collections.sort(ContactMenu.namelist);
        }
        catch (FileNotFoundException K) {
            K.printStackTrace();
        }
        catch (IOException K2) {
            K2.printStackTrace();
        }
    }
    
    public static void WriteInFile() {
        try {
            final FileWriter writer = new FileWriter("Contact.txt");
            for (final Contact contact : ContactMenu.arrayList) {
                writer.write(contact.information());
            }
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final ContactMenu frame = new ContactMenu();
                    frame.setVisible(true);
                    ContactMenu.ReadFromFile();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public ContactMenu() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1008, 764);
        (this.contentPane = new JPanel()).setBackground(Color.BLACK);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel Label_Cover = new JLabel("");
        Label_Cover.setBackground(Color.BLACK);
        Label_Cover.setBounds(97, 121, 346, 454);
        Image img = new ImageIcon(this.getClass().getResource("/contact_book.png")).getImage();
        Label_Cover.setIcon(new ImageIcon(img));
        this.contentPane.add(Label_Cover);
        final JLabel label = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
        label.setIcon(new ImageIcon(img));
        label.setBounds(461, 91, 104, 108);
        this.contentPane.add(label);
        final JLabel label_1 = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/search.png")).getImage();
        label_1.setIcon(new ImageIcon(img));
        label_1.setBounds(461, 235, 104, 108);
        this.contentPane.add(label_1);
        final JLabel label_2 = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
        label_2.setIcon(new ImageIcon(img));
        label_2.setBounds(461, 382, 104, 108);
        this.contentPane.add(label_2);
        final JLabel label_3 = new JLabel("");
        img = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
        label_3.setIcon(new ImageIcon(img));
        label_3.setBounds(461, 534, 104, 108);
        this.contentPane.add(label_3);
        final JButton Add_btn = new JButton("Add");
        Add_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final Add frame = new Add();
                frame.setVisible(true);
                ContactMenu.this.dispose();
            }
        });
        Add_btn.setFont(new Font("Times New Roman", 3, 40));
        Add_btn.setBounds(592, 99, 330, 86);
        this.contentPane.add(Add_btn);
        final JButton Search_btn = new JButton("Search");
        Search_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Search frame = new Search();
                frame.setVisible(true);
                ContactMenu.this.dispose();
            }
        });
        Search_btn.setFont(new Font("Times New Roman", 3, 40));
        Search_btn.setBounds(592, 243, 330, 86);
        this.contentPane.add(Search_btn);
        final JButton Edit_btn = new JButton("Edit");
        Edit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Edit frame = new Edit();
                frame.setVisible(true);
                ContactMenu.this.dispose();
            }
        });
        Edit_btn.setFont(new Font("Times New Roman", 3, 40));
        Edit_btn.setBounds(592, 391, 330, 86);
        this.contentPane.add(Edit_btn);
        final JButton Delete_btn = new JButton("Delete");
        Delete_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Delete frame = new Delete();
                frame.setVisible(true);
                ContactMenu.this.dispose();
            }
        });
        Delete_btn.setFont(new Font("Times New Roman", 3, 40));
        Delete_btn.setBounds(592, 540, 330, 86);
        this.contentPane.add(Delete_btn);
        final JButton Back_btn = new JButton("Back");
        Back_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final Cover frame = new Cover();
                frame.setVisible(true);
                ContactMenu.this.dispose();
            }
        });
        Back_btn.setFont(new Font("Times New Roman", 1, 35));
        Back_btn.setBounds(153, 632, 137, 40);
        this.contentPane.add(Back_btn);
    }
}
