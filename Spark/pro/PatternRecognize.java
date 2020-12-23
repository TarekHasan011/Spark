// 
// Decompiled by Procyon v0.5.36
// 

package pro;

public class PatternRecognize
{
    String patternString;
    
    public PatternRecognize(final String patternString) {
        this.patternString = patternString;
    }
    
    public String decryptString() {
        final String[] tempStrings = this.patternString.split(" ");
        final RSA rsa = new RSA();
        final byte[] decrypted = new byte[tempStrings.length];
        for (int i = 0; i != tempStrings.length; ++i) {
            decrypted[i] = Byte.parseByte(tempStrings[i]);
        }
        return new String(decrypted);
    }
}
