// 
// Decompiled by Procyon v0.5.36
// 

package Socket_Chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listener implements ActionListener
{
    @Override
    public void actionPerformed(final ActionEvent e) {
        ChatClient.out.println(ChatClient.textField.getText());
        ChatClient.textField.setText("");
    }
}
