// 
// Decompiled by Procyon v0.5.36
// 

package chat;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.KeyListener;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.util.Formatter;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Friend2
{
    private JFrame frame;
    private JLabel lblChatbot;
    private JTextField textField_1;
    private static String string;
    public static TextArea textArea_1;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final Formatter formatter = new Formatter("chat.txt");
                    formatter.format("", new Object[0]);
                    formatter.close();
                    Friend2.access$0(JOptionPane.showInputDialog("Enter Your Name :"));
                    final Friend2 window = new Friend2();
                    window.frame.setVisible(true);
                    final RunnableObject2 run2 = new RunnableObject2();
                    final Thread thread2 = new Thread(run2);
                    thread2.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Friend2() {
        this.initialize();
    }
    
    public static void actionPerformed() {
        Friend2.textArea_1.setText(null);
        try {
            final BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
            for (String string = br.readLine(); string != null; string = br.readLine()) {
                Friend2.textArea_1.append(String.valueOf(string) + "\n");
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }
    
    private void initialize() {
        (this.frame = new JFrame(Friend2.string)).setBounds(100, 100, 525, 696);
        this.frame.setDefaultCloseOperation(2);
        this.frame.getContentPane().setLayout(null);
        (this.lblChatbot = new JLabel("Talk wih Friends")).setForeground(Color.WHITE);
        this.lblChatbot.setBackground(Color.BLACK);
        this.lblChatbot.setOpaque(true);
        this.lblChatbot.setFont(new Font("Vladimir Script", 1, 50));
        this.lblChatbot.setHorizontalAlignment(0);
        this.lblChatbot.setBounds(10, 11, 369, 111);
        this.frame.getContentPane().add(this.lblChatbot);
        final JLabel icon_1 = new JLabel("");
        final Image imgImage = new ImageIcon(this.getClass().getResource("/friend2.png")).getImage();
        icon_1.setIcon(new ImageIcon(imgImage));
        icon_1.setBounds(389, 11, 110, 111);
        this.frame.getContentPane().add(icon_1);
        (Friend2.textArea_1 = new TextArea()).setForeground(Color.BLUE);
        Friend2.textArea_1.setFont(new Font("Times New Roman", 1, 14));
        Friend2.textArea_1.setBounds(10, 162, 489, 386);
        Friend2.textArea_1.setEditable(false);
        this.frame.getContentPane().add(Friend2.textArea_1);
        (this.textField_1 = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    try {
                        final BufferedWriter bw = new BufferedWriter(new FileWriter(new File("chat.txt"), true));
                        bw.write(String.valueOf(Friend2.string) + " :  " + Friend2.this.textField_1.getText() + "\t sent: " + Friend1.time() + "\r\n\n");
                        Friend2.this.textField_1.setText(null);
                        Friend2.textArea_1.setText(null);
                        bw.close();
                        final BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
                        for (String string = br.readLine(); string != null; string = br.readLine()) {
                            Friend2.textArea_1.append(String.valueOf(string) + "\n");
                        }
                        br.close();
                    }
                    catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
        this.textField_1.setFont(new Font("Times New Roman", 0, 14));
        this.textField_1.setBounds(10, 568, 489, 62);
        this.frame.getContentPane().add(this.textField_1);
        this.textField_1.setColumns(10);
        final JButton button = new JButton("Refresh");
        final Image img = new ImageIcon(this.getClass().getResource("/refresh.png")).getImage();
        button.setIcon(new ImageIcon(img));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                Friend2.textArea_1.setText(null);
                try {
                    final BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
                    for (String string = br.readLine(); string != null; string = br.readLine()) {
                        Friend2.textArea_1.append(String.valueOf(string) + "\n");
                    }
                    br.close();
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        });
        button.setSelected(true);
        button.setHorizontalAlignment(10);
        button.setForeground(Color.DARK_GRAY);
        button.setFont(new Font("Snap ITC", 0, 11));
        button.setBackground(Color.CYAN);
        button.setBounds(370, 133, 129, 23);
        this.frame.getContentPane().add(button);
        final JLabel label = new JLabel("@Md.Tarek Hasan");
        final Image imgI = new ImageIcon(this.getClass().getResource("/programmer.png")).getImage();
        label.setIcon(new ImageIcon(imgI));
        label.setOpaque(true);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Times New Roman", 1, 14));
        label.setBackground(Color.BLACK);
        label.setBounds(341, 629, 158, 25);
        this.frame.getContentPane().add(label);
        final JLabel label_1 = new JLabel("Write message here!");
        label_1.setOpaque(true);
        label_1.setHorizontalAlignment(2);
        label_1.setForeground(Color.LIGHT_GRAY);
        label_1.setFont(new Font("Tahoma", 1, 13));
        label_1.setBackground(Color.WHITE);
        label_1.setBounds(10, 553, 149, 14);
        this.frame.getContentPane().add(label_1);
    }
    
    static /* synthetic */ void access$0(final String string) {
        Friend2.string = string;
    }
}
