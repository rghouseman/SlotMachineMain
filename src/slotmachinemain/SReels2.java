/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachinemain;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Ryan Houseman
 */
public class SReels2 implements Runnable{
boolean colorState = true;
int state = 1;
int top =  20;
int stackt = 20;
int stackmt = 100;
int stackm = 180;
int stackmb = 260;
int stackb = 340;
int bottom = 340;
int xpos = 370;
ImageIcon icon1 = new ImageIcon("StrawberryCardL1.jpg");
ImageIcon icon2 = new ImageIcon("DieCardL1.jpg");
ImageIcon icon3 = new ImageIcon("TopSlice.jpg");
ImageIcon icon4 = new ImageIcon("ButtonSlice.jpg");
ImageIcon icon5 = new ImageIcon("MiddleSlice.jpg");
ImageIcon icon6 = new ImageIcon("RightSlice.jpg");
ImageIcon icon7 = new ImageIcon("LeftSlice.jpg");
ImageIcon icon8 = new ImageIcon("LeftSep.jpg");
ImageIcon icon9 = new ImageIcon("RightSep.jpg");
    @Override
    public void run() {
        for(int i = 0; i<= 25; i++)
        {
            {if(colorState == true)
        {
           SlotGui.R2Card2.setIcon(icon1);
        }
        if(colorState == false)
        {
            SlotGui.R2Card2.setIcon(icon2);
        }
            while(SlotGui.R2Card2.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            SlotGui.R2Card2.setLocation(xpos, top);
            if(colorState == true)
            {
                colorState = false;
            }
            else
            {
                colorState = true;
            }
            }
        }
        
           //one wins
     if(SlotGui.Sp2 == 0)
     {
        SlotGui.R2Card2.setIcon(icon1);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= stackmb)
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         
     }
     //2 wins
    else if(SlotGui.Sp2 == 1)
     {
         SlotGui.R2Card2.setIcon(icon1);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackm))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
    //3 wins
    else if(SlotGui.Sp2 == 2)
     {
         SlotGui.R2Card2.setIcon(icon1);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackmt))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
    //4 wins
    else if(SlotGui.Sp2 == 3)
     {
         while(SlotGui.R2Card2.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            SlotGui.R2Card2.setLocation(xpos, top);
         
         SlotGui.R2Card2.setIcon(icon1);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackt))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
    
     //5 wins
    else if(SlotGui.Sp2 == 4)
     {
         SlotGui.R2Card2.setIcon(icon1);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackmb))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
    
     //6 wins(same as one)
    else if(SlotGui.Sp2 == 5)
     {
         SlotGui.R2Card2.setIcon(icon2);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= stackmb)
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
     
      //7 wins
    else if(SlotGui.Sp2 == 6)
     {
         SlotGui.R2Card2.setIcon(icon2);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackm))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
      //8 wins
    else if(SlotGui.Sp2 == 7)
     {
         SlotGui.R2Card2.setIcon(icon2);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackmt))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
     
     //9 wins
    else if(SlotGui.Sp2 == 8)
     {
         while(SlotGui.R2Card2.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            SlotGui.R2Card2.setLocation(xpos, top);
         
         SlotGui.R2Card2.setIcon(icon2);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackt))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
     //10 wins
    else if(SlotGui.Sp2 == 9)
     {
         SlotGui.R2Card2.setIcon(icon2);
         while(SlotGui.R2Card2.getLocationOnScreen().y <= (stackmb))
            {
                SlotGui.R2Card2.setLocation(xpos,SlotGui.R2Card2.getLocationOnScreen().y - (1/100));
                SlotGui.jLabel1.setIcon(icon3);
                SlotGui.jLabel2.setIcon(icon4);
                SlotGui.jLabel3.setIcon(icon5);
                SlotGui.jLabel5.setIcon(icon6);
                SlotGui.jLabel7.setIcon(icon7);
                SlotGui.jLabel6.setIcon(icon8);
                SlotGui.jLabel4.setIcon(icon9);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     }
    }

}


