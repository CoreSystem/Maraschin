package br.com.core.predefinido;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author CoreSystem™
 * @version v1.0
 */
public class Threads implements Runnable{
    
    public Threads (){
        run();
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {            
            System.out.println(x++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
