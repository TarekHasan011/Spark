// 
// Decompiled by Procyon v0.5.36
// 

package pro;

public class Decrypt_My_Message
{
    public String message;
    public int[] n;
    
    public Decrypt_My_Message(final String message, final int[] n) {
        this.message = message;
        this.n = n;
        this.mod_25();
    }
    
    private void mod_25() {
        for (int i = 0; i != this.n.length; ++i) {
            final int[] n = this.n;
            final int n2 = i;
            n[n2] %= 26;
        }
    }
    
    String decompile_it() {
        String noobString = "";
        int f = 0;
        for (int i = 0; i != this.message.length(); ++i) {
            char c = this.message.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if ((char)(c - this.n[f]) < 'A') {
                    int count;
                    for (count = 0; c != 'A'; --c, ++count) {}
                    c -= 'A';
                    c += (char)(90 - (this.n[f] - count - 1));
                }
                else {
                    c -= (char)this.n[f];
                }
                ++f;
            }
            else if (c >= 'a' && c <= 'z') {
                if ((char)(c - this.n[f]) < 'a') {
                    int count;
                    for (count = 0; c != 'a'; --c, ++count) {}
                    c -= 'a';
                    c += (char)(122 - (this.n[f] - count - 1));
                }
                else {
                    c -= (char)this.n[f];
                }
                ++f;
            }
            noobString = String.valueOf(noobString) + c;
            if (f == this.n.length) {
                f = 0;
            }
        }
        return noobString;
    }
}
