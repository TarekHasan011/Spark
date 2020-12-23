// 
// Decompiled by Procyon v0.5.36
// 

package pro;

import java.util.Random;
import java.math.BigInteger;

public class RSA
{
    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int bitlength;
    private Random r;
    
    public RSA() {
        this.bitlength = 1024;
        this.r = new Random();
        this.p = BigInteger.probablePrime(this.bitlength, this.r);
        this.q = BigInteger.probablePrime(this.bitlength, this.r);
        this.N = this.p.multiply(this.q);
        this.phi = this.p.subtract(BigInteger.ONE).multiply(this.q.subtract(BigInteger.ONE));
        this.e = BigInteger.probablePrime(this.bitlength / 2, this.r);
        while (this.phi.gcd(this.e).compareTo(BigInteger.ONE) > 0 && this.e.compareTo(this.phi) < 0) {
            this.e.add(BigInteger.ONE);
        }
        this.d = this.e.modInverse(this.phi);
    }
    
    public RSA(final BigInteger e, final BigInteger d, final BigInteger N) {
        this.bitlength = 1024;
        this.e = e;
        this.d = d;
        this.N = N;
    }
    
    public static String bytesToString(final byte[] encrypted) {
        String test = "";
        for (final byte b : encrypted) {
            test = String.valueOf(test) + Byte.toString(b);
        }
        return test;
    }
    
    public byte[] encrypt(final byte[] message) {
        return new BigInteger(message).modPow(this.e, this.N).toByteArray();
    }
    
    public byte[] decrypt(final byte[] message) {
        return new BigInteger(message).modPow(this.d, this.N).toByteArray();
    }
}
