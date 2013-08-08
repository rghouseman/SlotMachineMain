
package slotmachinemain;


import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;




public class Reels implements Runnable{
boolean colorState;
int state = 1;
int top =  20;
int stackt = 20;
int stackmt = 100;
int stackm = 180;
int stackbm = 260;
int stackb = 340;
int bottom = 340;
int xpos = 210;
ImageIcon icon1 = new ImageIcon("BellCardL1.jpg");
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
        for(int i = 0; i<= 20; i++)
        {
            {if(colorState == true)
        {
           SlotGui.Card1.setIcon(icon1);
        }
        if(colorState == false)
        {
            SlotGui.Card1.setIcon(icon2);
        }
            while(SlotGui.Card1.getLocationOnScreen().y <= bottom)
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
            SlotGui.Card1.setLocation(xpos, top);
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
     if(SlotGui.Sp1 == 0)
     {
     
         SlotGui.Card1.setIcon(icon1);
         
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackm))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1==1)
     {
         SlotGui.Card1.setIcon(icon1);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackmt))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1 == 2)
     {
         SlotGui.Card1.setIcon(icon1);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackt))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1 == 3)
     {
         SlotGui.Card1.setIcon(icon1);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackb))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1 == 4)
     {
         SlotGui.Card1.setIcon(icon1);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackbm))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
     else if(SlotGui.Sp1 == 5)
     {
         SlotGui.Card1.setIcon(icon2);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackm))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1==6)
     {
         SlotGui.Card1.setIcon(icon2);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackmt))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1 == 7)
     {
         SlotGui.Card1.setIcon(icon2);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackt))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1 == 8)
     {
         SlotGui.Card1.setIcon(icon2);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackb))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
    else if(SlotGui.Sp1 == 9)
     {
         SlotGui.Card1.setIcon(icon2);
         while(SlotGui.Card1.getLocationOnScreen().y <= (stackbm))
            {
                SlotGui.Card1.setLocation(xpos,SlotGui.Card1.getLocationOnScreen().y - (1/100));
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
