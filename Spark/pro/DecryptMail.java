// 
// Decompiled by Procyon v0.5.36
// 

package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
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

public class DecryptMail extends JFrame
{
    private JPanel contentPane;
    private JTextField pattern_Field;
    private JTextField regFIeld;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final DecryptMail frame = new DecryptMail();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public DecryptMail() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1008, 764);
        (this.contentPane = new JPanel()).setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        final JLabel lblNewLabel = new JLabel("Pattern");
        lblNewLabel.setFont(new Font("Times New Roman", 1, 24));
        lblNewLabel.setBounds(10, 34, 102, 28);
        this.contentPane.add(lblNewLabel);
        (this.pattern_Field = new JTextField()).setFont(new Font("Times New Roman", 1, 20));
        this.pattern_Field.setText("copy from mail");
        this.pattern_Field.setColumns(10);
        this.pattern_Field.setBounds(104, 34, 385, 28);
        this.contentPane.add(this.pattern_Field);
        final TextArea encryptArea = new TextArea();
        encryptArea.setFont(new Font("Times New Roman", 0, 16));
        encryptArea.setBounds(20, 107, 469, 605);
        this.contentPane.add(encryptArea);
        final JLabel label = new JLabel("Encrypted Message");
        label.setForeground(Color.RED);
        label.setFont(new Font("Times New Roman", 1, 24));
        label.setBounds(20, 73, 222, 28);
        this.contentPane.add(label);
        final JLabel lblDecryptedMessage = new JLabel("Decrypted Message");
        lblDecryptedMessage.setForeground(Color.BLUE);
        lblDecryptedMessage.setFont(new Font("Times New Roman", 1, 24));
        lblDecryptedMessage.setBounds(506, 73, 222, 28);
        this.contentPane.add(lblDecryptedMessage);
        final TextArea decryptArea = new TextArea();
        decryptArea.setFont(new Font("Times New Roman", 0, 16));
        decryptArea.setEditable(false);
        decryptArea.setBounds(503, 107, 479, 605);
        this.contentPane.add(decryptArea);
        final Button decryptbtn = new Button("Decrypt");
        decryptbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                final int[] random = { 82746559, 87485807, 35257915, 21971437, 97485089, 32911546, 55734563, 37603554, 67926578, 63068774, 90304815, 14096584, 46261263, 31044170, 81016252, 11319047, 91385333, 89037744, 78145462, 88563527, 28247463, 16466912, 28180567, 74701839, 35165448, 3866182, 54169357, 68117503, 28629448, 13614402, 88111226, 49560998, 54504763, 40936332, 18699669, 9442817, 69664837, 96927298, 40955117, 43932817, 81641842, 16131728, 60201998, 31308568, 75658786, 19539707, 98693372, 96308975, 99503585, 67254090, 60506332, 44990727, 5564373, 67857425, 9422514, 85955450, 87345744, 39017179, 99415621, 33669837, 16213894, 92840691, 77095455, 51161797, 16103000, 54420687, 23093937, 66548194, 19730511, 91503898, 84133779, 97937788, 49883044, 80910685, 514536, 83950457, 48593787, 78811209, 85509856, 19169705, 2001201, 97300899, 81932887, 92582846, 56462794, 85029068, 39878299, 86210795, 51487885, 49012716, 36163914, 18826007, 44682156, 9995451, 42548314, 23726014, 83031322, 12178668, 86381363, 12394341, 18015361 };
                final String strings = DecryptMail.this.pattern_Field.getText();
                final String[] tempsplitStrings = strings.split(" ");
                String temporaryString = "";
                int i = 0;
                int j = 0;
                while (i != tempsplitStrings.length) {
                    final int test = Integer.parseInt(tempsplitStrings[i]) - random[j++];
                    if (j == random.length) {
                        j = 0;
                    }
                    temporaryString = String.valueOf(temporaryString) + String.valueOf(test);
                    temporaryString = String.valueOf(temporaryString) + " ";
                    ++i;
                }
                temporaryString.trim();
                final PatternRecognize patternRecognize = new PatternRecognize(temporaryString);
                final String string = patternRecognize.decryptString();
                DecryptMail.this.regFIeld.setText(string);
                final String[] tempStrings = string.split(" ");
                final int[] arr = new int[tempStrings.length];
                for (int k = 0; k != tempStrings.length; ++k) {
                    arr[k] = Integer.parseInt(tempStrings[k]);
                }
                final Decrypt_My_Message decrypt_My_Message = new Decrypt_My_Message(encryptArea.getText(), arr);
                decryptArea.setText(decrypt_My_Message.decompile_it());
            }
        });
        decryptbtn.setForeground(Color.WHITE);
        decryptbtn.setBackground(Color.BLACK);
        decryptbtn.setFont(new Font("Times New Roman", 1, 18));
        decryptbtn.setBounds(357, 68, 132, 33);
        this.contentPane.add(decryptbtn);
        final JLabel lblRecongnizedPattern = new JLabel("Recongnized Pattern");
        lblRecongnizedPattern.setFont(new Font("Times New Roman", 1, 15));
        lblRecongnizedPattern.setBounds(499, 34, 142, 28);
        this.contentPane.add(lblRecongnizedPattern);
        (this.regFIeld = new JTextField()).setEditable(false);
        this.regFIeld.setFont(new Font("Times New Roman", 1, 16));
        this.regFIeld.setColumns(10);
        this.regFIeld.setBounds(651, 34, 331, 28);
        this.contentPane.add(this.regFIeld);
        final Button button = new Button("Main Menu");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final EndeMenu frame = new EndeMenu();
                frame.setVisible(true);
                DecryptMail.this.dispose();
            }
        });
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Times New Roman", 1, 18));
        button.setBackground(Color.WHITE);
        button.setBounds(850, 73, 132, 33);
        this.contentPane.add(button);
    }
}
