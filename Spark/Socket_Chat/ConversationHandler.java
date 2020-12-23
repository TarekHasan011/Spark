// 
// Decompiled by Procyon v0.5.36
// 

package Socket_Chat;

import java.util.Iterator;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.Socket;

class ConversationHandler extends Thread
{
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    String name;
    PrintWriter pw;
    static FileWriter fw;
    static BufferedWriter bw;
    
    public ConversationHandler(final Socket socket) throws IOException {
        this.socket = socket;
        ConversationHandler.fw = new FileWriter("C:\\Users\\Tarek\\Desktop\\input(2).txt", true);
        ConversationHandler.bw = new BufferedWriter(ConversationHandler.fw);
        this.pw = new PrintWriter(ConversationHandler.bw, true);
    }
    
    @Override
    public void run() {
        try {
            this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.out = new PrintWriter(this.socket.getOutputStream(), true);
            int count = 0;
            while (true) {
                if (count > 0) {
                    this.out.println("NAMEALREADYEXISTS");
                }
                else {
                    this.out.println("NAMEREQUIRED");
                }
                this.name = this.in.readLine();
                if (this.name == null) {
                    return;
                }
                if (!ChatServer.userNames.contains(this.name)) {
                    ChatServer.userNames.add(this.name);
                    this.out.println("NAMEACCEPTED" + this.name);
                    ChatServer.printWriters.add(this.out);
                    while (true) {
                        final String message = this.in.readLine();
                        if (message == null) {
                            break;
                        }
                        this.pw.println(String.valueOf(this.name) + ": " + message);
                        for (final PrintWriter writer : ChatServer.printWriters) {
                            writer.println(String.valueOf(this.name) + ": " + message);
                        }
                    }
                    return;
                }
                ++count;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
