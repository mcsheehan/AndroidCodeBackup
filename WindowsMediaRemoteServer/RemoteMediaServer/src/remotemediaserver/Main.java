/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package remotemediaserver;

import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mcs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main (String a[])
    {

    	Thread desktopServerThread = new Thread(new TCPDesktopServer());
    	desktopServerThread.start();
        

        //        try
//        {
//            desktopServerThread.wait(10);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
