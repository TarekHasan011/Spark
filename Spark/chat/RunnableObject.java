// 
// Decompiled by Procyon v0.5.36
// 

package chat;

public class RunnableObject implements Runnable
{
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Friend1.actionPerformed();
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException e) {
                break;
            }
        }
    }
}
