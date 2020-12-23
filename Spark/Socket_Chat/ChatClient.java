// 
// Decompiled by Procyon v0.5.36
// 

package Socket_Chat;

import java.io.Reader;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import java.io.PrintWriter;
import java.io.BufferedReader;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class ChatClient
{
    static JFrame chatWindow;
    static JTextArea chatArea;
    static JTextField textField;
    static JLabel blankLabel;
    static JButton sendButton;
    static BufferedReader in;
    static PrintWriter out;
    static JLabel nameLabel;
    
    static {
        ChatClient.chatWindow = new JFrame("Chat Application");
        ChatClient.chatArea = new JTextArea(22, 40);
        ChatClient.textField = new JTextField(40);
        ChatClient.blankLabel = new JLabel("           ");
        ChatClient.sendButton = new JButton("Send");
        ChatClient.nameLabel = new JLabel("         ");
    }
    
    ChatClient() {
        ChatClient.chatWindow.setLayout(new FlowLayout());
        ChatClient.chatWindow.add(ChatClient.nameLabel);
        ChatClient.chatWindow.add(new JScrollPane(ChatClient.chatArea));
        ChatClient.chatWindow.add(ChatClient.blankLabel);
        ChatClient.chatWindow.add(ChatClient.textField);
        ChatClient.chatWindow.add(ChatClient.sendButton);
        ChatClient.chatWindow.setDefaultCloseOperation(3);
        ChatClient.chatWindow.setSize(475, 500);
        ChatClient.chatWindow.setVisible(true);
        ChatClient.textField.setEditable(false);
        ChatClient.chatArea.setEditable(false);
        ChatClient.sendButton.addActionListener(new Listener());
        ChatClient.textField.addActionListener(new Listener());
    }
    
    void startChat() throws Exception {
        final String ipAddress = JOptionPane.showInputDialog(ChatClient.chatWindow, "Enter IP Address:", "IP Address Required!!", -1);
        final Socket soc = new Socket(ipAddress, 9806);
        ChatClient.in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        ChatClient.out = new PrintWriter(soc.getOutputStream(), true);
        while (true) {
            final String str = ChatClient.in.readLine();
            if (str.equals("NAMEREQUIRED")) {
                final String name = JOptionPane.showInputDialog(ChatClient.chatWindow, "Enter a unique name:", "Name Required!!", -1);
                ChatClient.out.println(name);
            }
            else if (str.equals("NAMEALREADYEXISTS")) {
                final String name = JOptionPane.showInputDialog(ChatClient.chatWindow, "Enter another name:", "Name Already Exits!!", 2);
                ChatClient.out.println(name);
            }
            else if (str.startsWith("NAMEACCEPTED")) {
                ChatClient.textField.setEditable(true);
                ChatClient.nameLabel.setText("You are logged in as: " + str.substring(12));
            }
            else {
                ChatClient.chatArea.append(String.valueOf(str) + "\n");
            }
        }
    }
    
    public static void main(final String[] args) throws Exception {
        final ChatClient client = new ChatClient();
        client.startChat();
    }
}
