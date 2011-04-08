/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package remotemediaserver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

/**
 *
 * @author mcs
 */
public class DoKeyBoardControl {

    public static void HandleKeyPresses(KeyPressed Input) {
        try {
            Robot robot = new Robot();


            switch (Input) {
                case UP:
                    robot.keyPress(KeyEvent.VK_UP);
                    break;
                case DOWN:
                    robot.keyPress(KeyEvent.VK_DOWN);
                    break;
                case LEFT:
                    robot.keyPress(KeyEvent.VK_LEFT);
                    break;
                case RIGHT:
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    break;
            }
        } catch (AWTException e)
        {
        }
    }

    public static void DoKeyDown() {
    }

    public enum KeyPressed {

        UP, DOWN, LEFT, RIGHT, PLAY, PAUSE, STOP, FASTFORWARD, REWIND;  //; is optional
    }
}
