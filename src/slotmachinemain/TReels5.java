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
public class TReels5 implements Runnable{
boolean colorState = true;
int state = 1;
int top =  20;
int stackt = 20;
int stackmt = 100;
int stackm = 180;
int stackmb = 260;
int stackb = 340;
int bottom = 340;
int xpos = 510;
ImageIcon icon1 = new ImageIcon("CoinsCardL1.jpg");
ImageIcon icon2 = new ImageIcon("SevenCardL1.jpg");
ImageIcon icon3 = new ImageIcon("TopSlice.jpg");
ImageIcon icon4 = new ImageIcon("ButtonSlice.jpg");
ImageIcon icon5 = new ImageIcon("MiddleSlice.jpg");
ImageIcon icon6 = new ImageIcon("RightSlice.jpg");
ImageIcon icon7 = new ImageIcon("LeftSlice.jpg");
ImageIcon icon8 = new ImageIcon("LeftSep.jpg");
ImageIcon icon9 = new ImageIcon("RightSep.jpg");
    @Override
    public void run() {
        for(int i = 0; i<= 30; i++)
        {
            {if(colorState == true)
        {
           SlotGui.R3Card5.setIcon(icon1);
          
        }
        if(colorState == false)
        {
           SlotGui.R3Card5.setIcon(icon2);
        }
            while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
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
     if(SlotGui.Sp3 == 0)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon1);
         
         while(SlotGui.R3Card5.getLocationOnScreen().y <= stackmt)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 1)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon1);
         while(SlotGui.R3Card5.getLocationOnScreen().y <= (stackt))
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 2)
     {
         SlotGui.R3Card5.setIcon(icon1);
         while(SlotGui.R3Card5.getLocationOnScreen().y <= (stackb))
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 3)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon1);
         
         while(SlotGui.R3Card5.getLocationOnScreen().y <= stackmb)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 4)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon1);
         
         while(SlotGui.R3Card5.getLocationOnScreen().y <= stackm)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 5)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon2);
         
         while(SlotGui.R3Card5.getLocationOnScreen().y <= stackmt)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 6)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon2);
         while(SlotGui.R3Card5.getLocationOnScreen().y <= (stackt))
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 7)
     {
         SlotGui.R3Card5.setIcon(icon2);
         while(SlotGui.R3Card5.getLocationOnScreen().y <= (stackb))
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 8)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon2);
         
         while(SlotGui.R3Card5.getLocationOnScreen().y <= stackmb)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp3 == 9)
     {
          while(SlotGui.R3Card5.getLocationOnScreen().y <= bottom)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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
            SlotGui.R3Card5.setLocation(xpos, top);
         SlotGui.R3Card5.setIcon(icon2);
         
         while(SlotGui.R3Card5.getLocationOnScreen().y <= stackm)
            {
                SlotGui.R3Card5.setLocation(xpos,SlotGui.R3Card5.getLocationOnScreen().y - (1/100));
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


