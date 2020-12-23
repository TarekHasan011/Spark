// 
// Decompiled by Procyon v0.5.36
// 

package Socket_Chat;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ChatServer
{
    static ArrayList<String> userNames;
    static ArrayList<PrintWriter> printWriters;
    
    static {
        ChatServer.userNames = new ArrayList<String>();
        ChatServer.printWriters = new ArrayList<PrintWriter>();
    }
    
    public static void main(final String[] args) throws Exception {
        System.out.println("Waiting for clients...");
        final ServerSocket ss = new ServerSocket(9806);
        while (true) {
            final Socket soc = ss.accept();
            System.out.println("Connection established");
            final ConversationHandler handler = new ConversationHandler(soc);
            handler.start();
        }
    }
}
