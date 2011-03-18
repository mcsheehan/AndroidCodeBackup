/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package remotemediaserver;

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
    }
}
