// 
// Decompiled by Procyon v0.5.36
// 

package pro;

import java.awt.Button;
import java.awt.Color;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class SendMail extends JFrame
{
    private JPanel contentPane;
    private JTextField from_field;
    private JTextField to_field;
    private JTextField subject_field;
    private JTextField pattern_field;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final SendMail frame = new SendMail();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public String getString() {
        final RSA rsa = new RSA();
        final String string = this.pattern_field.getText();
        final int[] random = { 82746559, 87485807, 35257915, 21971437, 97485089, 32911546, 55734563, 37603554, 67926578, 63068774, 90304815, 14096584, 46261263, 31044170, 81016252, 11319047, 91385333, 89037744, 78145462, 88563527, 28247463, 16466912, 28180567, 74701839, 35165448, 3866182, 54169357, 68117503, 28629448, 13614402, 88111226, 49560998, 54504763, 40936332, 18699669, 9442817, 69664837, 96927298, 40955117, 43932817, 81641842, 16131728, 60201998, 31308568, 75658786, 19539707, 98693372, 96308975, 99503585, 67254090, 60506332, 44990727, 5564373, 67857425, 9422514, 85955450, 87345744, 39017179, 99415621, 33669837, 16213894, 92840691, 77095455, 51161797, 16103000, 54420687, 23093937, 66548194, 19730511, 91503898, 84133779, 97937788, 49883044, 80910685, 514536, 83950457, 48593787, 78811209, 85509856, 19169705, 2001201, 97300899, 81932887, 92582846, 56462794, 85029068, 39878299, 86210795, 51487885, 49012716, 36163914, 18826007, 44682156, 9995451, 42548314, 23726014, 83031322, 12178668, 86381363, 12394341, 18015361 };
        String tempString = "";
        final byte[] encrypted = rsa.encrypt(string.getBytes());
        final byte[] decrypted = rsa.decrypt(encrypted);
        int i = 0;
        int j = 0;
        while (i != decrypted.length) {
            final int temp = decrypted[i] + random[j++];
            if (j == random.length) {
                j = 0;
            }
            tempString = String.valueOf(tempString) + String.valueOf(temp);
            tempString = String.valueOf(tempString) + " ";
            ++i;
        }
        return tempString;
    }
    
    public SendMail() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1008, 764);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel from = new JLabel("From");
        from.setFont(new Font("Times New Roman", 1, 20));
        from.setBounds(25, 28, 117, 26);
        this.contentPane.add(from);
        final JLabel to = new JLabel("To");
        to.setFont(new Font("Times New Roman", 1, 20));
        to.setBounds(25, 65, 117, 26);
        this.contentPane.add(to);
        final JLabel subject = new JLabel("Subject");
        subject.setFont(new Font("Times New Roman", 1, 20));
        subject.setBounds(25, 111, 117, 26);
        this.contentPane.add(subject);
        (this.from_field = new JTextField()).setFont(new Font("Times New Roman", 1, 16));
        this.from_field.setColumns(10);
        this.from_field.setBounds(120, 28, 850, 26);
        this.contentPane.add(this.from_field);
        (this.to_field = new JTextField()).setFont(new Font("Times New Roman", 0, 16));
        this.to_field.setColumns(10);
        this.to_field.setBounds(120, 65, 850, 26);
        this.contentPane.add(this.to_field);
        (this.subject_field = new JTextField()).setFont(new Font("Times New Roman", 1, 16));
        this.subject_field.setColumns(10);
        this.subject_field.setBounds(120, 111, 850, 26);
        this.contentPane.add(this.subject_field);
        final TextArea mail = new TextArea();
        mail.setFont(new Font("Times New Roman", 0, 16));
        mail.setText("Write Message...");
        mail.setBounds(25, 166, 945, 447);
        this.contentPane.add(mail);
        final JLabel pattern = new JLabel("Pattern");
        pattern.setFont(new Font("Times New Roman", 1, 20));
        pattern.setBounds(25, 639, 117, 26);
        this.contentPane.add(pattern);
        (this.pattern_field = new JTextField()).setText("2 3 5 7 11");
        this.pattern_field.setToolTipText("");
        this.pattern_field.setFont(new Font("Times New Roman", 1, 16));
        this.pattern_field.setColumns(10);
        this.pattern_field.setBounds(120, 639, 850, 26);
        this.contentPane.add(this.pattern_field);
        final JButton EncryptAndSend_btn = new JButton("Encrypt and Send");
        EncryptAndSend_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final String From = SendMail.this.from_field.getText();
                final String To = SendMail.this.to_field.getText();
                final String Subject = SendMail.this.subject_field.getText();
                if (From.equals("") || To.equals("") || Subject.equals("")) {
                    JOptionPane.showMessageDialog(SendMail.this.contentPane, "Please fill up all boxes", "All field required!!", 2);
                }
                else {
                    final String Password = JOptionPane.showInputDialog(SendMail.this.contentPane, "Enter Password for " + From, "Password required!!", -1);
                    final Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");
                    final Session session = Session.getDefaultInstance(properties, (Authenticator)new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(From, Password);
                        }
                    });
                    try {
                        final MimeMessage message = new MimeMessage(session);
                        message.setFrom((Address)new InternetAddress(From));
                        message.setSubject(Subject);
                        final String patternString = SendMail.this.pattern_field.getText();
                        int[] Pattern;
                        if (patternString.length() == 0) {
                            Pattern = new int[] { 0 };
                        }
                        else {
                            final String[] splitStrings = patternString.split(" ");
                            Pattern = new int[splitStrings.length];
                            for (int i = 0; i != splitStrings.length; ++i) {
                                Pattern[i] = Integer.parseInt(splitStrings[i]);
                            }
                        }
                        message.setText(String.valueOf(new Encrypt_My_Message(mail.getText(), Pattern).encrypt()) + "\r\n" + SendMail.this.getString());
                        final String[] Received = To.split(" ");
                        for (int i = 0; i != Received.length; ++i) {
                            message.addRecipient(Message.RecipientType.TO, (Address)new InternetAddress(Received[i]));
                            Transport.send((Message)message);
                        }
                        JOptionPane.showMessageDialog(SendMail.this.contentPane, "Successfully Sent Mail to " + To);
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(SendMail.this.contentPane, e.getMessage(), "Waring!!", 2);
                    }
                }
            }
        });
        EncryptAndSend_btn.setBackground(Color.GREEN);
        EncryptAndSend_btn.setFont(new Font("TI-Nspire", 3, 18));
        EncryptAndSend_btn.setBounds(25, 688, 191, 23);
        this.contentPane.add(EncryptAndSend_btn);
        final Button button = new Button("Main Menu");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final EndeMenu frame = new EndeMenu();
                frame.setVisible(true);
                SendMail.this.dispose();
            }
        });
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Times New Roman", 1, 18));
        button.setBackground(Color.WHITE);
        button.setBounds(838, 678, 132, 33);
        this.contentPane.add(button);
    }
}
