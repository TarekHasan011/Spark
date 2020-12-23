// 
// Decompiled by Procyon v0.5.36
// 

package Time;

import java.util.Date;
import java.text.SimpleDateFormat;

public class RunnableObjectClass implements Runnable
{
    public String Time() {
        final SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        return sdf.format(new Date());
    }
    
    public String Date() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd / MM / yyyy");
        return sdf.format(new Date());
    }
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Time.timeField.setText(this.Time());
            Time.date_field.setText(this.Date());
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {
                break;
            }
        }
    }
}
