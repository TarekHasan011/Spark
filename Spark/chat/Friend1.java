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
import java.util.Date;
import java.text.SimpleDateFormat;
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

public class Friend1
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
                    Friend1.access$0(JOptionPane.showInputDialog("Enter Your Name :"));
                    final Friend1 window = new Friend1();
                    window.frame.setVisible(true);
                    final RunnableObject runnableObject = new RunnableObject();
                    final Thread thread1 = new Thread(runnableObject);
                    thread1.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Friend1() {
        this.initialize();
    }
    
    public static void actionPerformed() {
        Friend1.textArea_1.setText(null);
        try {
            final BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
            for (String string = br.readLine(); string != null; string = br.readLine()) {
                Friend1.textArea_1.append(String.valueOf(string) + "\n");
            }
            br.close();
        }
        catch (FileNotFoundException K) {
            K.printStackTrace();
        }
        catch (IOException K2) {
            K2.printStackTrace();
        }
    }
    
    public static String time() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        return sdf.format(new Date());
    }
    
    private void initialize() {
        (this.frame = new JFrame(Friend1.string)).setBounds(100, 100, 525, 696);
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
        final Image imgImage = new ImageIcon(this.getClass().getResource("/friend1.png")).getImage();
        icon_1.setIcon(new ImageIcon(imgImage));
        icon_1.setBounds(389, 11, 110, 111);
        this.frame.getContentPane().add(icon_1);
        (Friend1.textArea_1 = new TextArea()).setFont(new Font("Times New Roman", 1, 14));
        Friend1.textArea_1.setForeground(Color.RED);
        Friend1.textArea_1.setBackground(Color.WHITE);
        Friend1.textArea_1.setBounds(10, 161, 489, 386);
        Friend1.textArea_1.setEditable(false);
        this.frame.getContentPane().add(Friend1.textArea_1);
        (this.textField_1 = new JTextField()).addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    try {
                        final BufferedWriter bw = new BufferedWriter(new FileWriter(new File("chat.txt"), true));
                        bw.write(String.valueOf(Friend1.string) + " :  " + Friend1.this.textField_1.getText() + "\t sent: " + Friend1.time() + "\r\n\n");
                        Friend1.this.textField_1.setText(null);
                        Friend1.textArea_1.setText(null);
                        bw.close();
                        final BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
                        for (String string = br.readLine(); string != null; string = br.readLine()) {
                            Friend1.textArea_1.append(String.valueOf(string) + "\n");
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
            public void actionPerformed(final ActionEvent e) {
                Friend1.textArea_1.setText(null);
                try {
                    final BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
                    for (String string = br.readLine(); string != null; string = br.readLine()) {
                        Friend1.textArea_1.append(String.valueOf(string) + "\n");
                    }
                    br.close();
                }
                catch (FileNotFoundException K) {
                    K.printStackTrace();
                }
                catch (IOException K2) {
                    K2.printStackTrace();
                }
            }
        });
        button.setSelected(true);
        button.setHorizontalAlignment(10);
        button.setForeground(Color.DARK_GRAY);
        button.setFont(new Font("Snap ITC", 0, 11));
        button.setBackground(Color.CYAN);
        button.setBounds(362, 132, 137, 23);
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
        Friend1.string = string;
    }
}
