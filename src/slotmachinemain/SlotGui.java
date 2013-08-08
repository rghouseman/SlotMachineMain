
package slotmachinemain;

import java.awt.Image;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class SlotGui extends javax.swing.JFrame {
public static int Sp1;
public static int Sp2;
public static int Sp3;

   public static Accounts newPlayer = new Accounts();
    public SlotGui() {
        initComponents();
        

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        Credit = new javax.swing.JLabel();
        Payout = new javax.swing.JLabel();
        Spins = new javax.swing.JLabel();
        TotalW = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Card1 = new javax.swing.JLabel();
        Card2 = new javax.swing.JLabel();
        Card3 = new javax.swing.JLabel();
        Card4 = new javax.swing.JLabel();
        Card5 = new javax.swing.JLabel();
        R2Card1 = new javax.swing.JLabel();
        R2Card2 = new javax.swing.JLabel();
        R2Card3 = new javax.swing.JLabel();
        R2Card4 = new javax.swing.JLabel();
        R2Card5 = new javax.swing.JLabel();
        R3Card1 = new javax.swing.JLabel();
        R3Card2 = new javax.swing.JLabel();
        R3Card3 = new javax.swing.JLabel();
        R3Card4 = new javax.swing.JLabel();
        R3Card5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slots!");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("SPIN");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(580, 310, 90, 40);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Credit.setFont(new java.awt.Font("Txt", 1, 11)); // NOI18N
        Credit.setForeground(new java.awt.Color(255, 255, 0));
        Credit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Credit.setText("$5.00");
        Credit.setBounds(540, 370, 60, 13);
        jLayeredPane1.add(Credit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Payout.setFont(new java.awt.Font("Txt", 1, 11)); // NOI18N
        Payout.setForeground(new java.awt.Color(255, 255, 0));
        Payout.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Payout.setText("$0.00");
        Payout.setBounds(650, 370, 60, 13);
        jLayeredPane1.add(Payout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Spins.setFont(new java.awt.Font("Txt", 1, 11)); // NOI18N
        Spins.setForeground(new java.awt.Color(255, 255, 0));
        Spins.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Spins.setText("20");
        Spins.setBounds(540, 420, 60, 13);
        jLayeredPane1.add(Spins, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TotalW.setFont(new java.awt.Font("Txt", 1, 11)); // NOI18N
        TotalW.setForeground(new java.awt.Color(255, 255, 0));
        TotalW.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        TotalW.setText("$0.00");
        TotalW.setBounds(650, 420, 60, 13);
        jLayeredPane1.add(TotalW, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Status.setFont(new java.awt.Font("Txt", 1, 18)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 0));
        Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status.setText("25c To Play");
        Status.setBounds(210, 370, 160, 50);
        jLayeredPane1.add(Status, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Credit");
        jLabel8.setBounds(540, 350, 60, 20);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Payout");
        jLabel9.setBounds(650, 350, 70, 20);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Spins");
        jLabel10.setBounds(540, 394, 60, 20);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Total Won");
        jLabel11.setBounds(650, 394, 70, 20);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/TopSlice.jpg"))); // NOI18N
        jLabel1.setBounds(0, 0, 900, 150);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/ButtonSlice.jpg"))); // NOI18N
        jLabel2.setBounds(0, 350, 900, 90);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/MiddleSlice.jpg"))); // NOI18N
        jLabel3.setBounds(0, 290, 900, 60);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/RightSlice.jpg"))); // NOI18N
        jLabel5.setBounds(650, 150, 250, 140);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/LeftSlice.jpg"))); // NOI18N
        jLabel7.setBounds(0, 150, 230, 140);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/LeftSep.jpg"))); // NOI18N
        jLabel6.setBounds(360, 150, 20, 140);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/RightSep.jpg"))); // NOI18N
        jLabel4.setBounds(500, 150, 20, 140);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Card1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/BellCardD1.jpg"))); // NOI18N
        Card1.setToolTipText("");
        Card1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Card1.setOpaque(true);
        Card1.setBounds(210, 20, 150, 80);
        jLayeredPane1.add(Card1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Card2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/CoinsCardD1.jpg"))); // NOI18N
        Card2.setToolTipText("");
        Card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Card2.setOpaque(true);
        Card2.setBounds(210, 100, 150, 80);
        jLayeredPane1.add(Card2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Card3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/GrapeCardD1.jpg"))); // NOI18N
        Card3.setToolTipText("");
        Card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Card3.setOpaque(true);
        Card3.setBounds(210, 180, 150, 80);
        jLayeredPane1.add(Card3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Card4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/BarCardD1.jpg"))); // NOI18N
        Card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Card4.setOpaque(true);
        Card4.setBounds(210, 260, 150, 80);
        jLayeredPane1.add(Card4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Card5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/StrawberryCardD1.jpg"))); // NOI18N
        Card5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Card5.setOpaque(true);
        Card5.setBounds(210, 340, 150, 80);
        jLayeredPane1.add(Card5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R2Card1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/HShoeCardD1.jpg"))); // NOI18N
        R2Card1.setToolTipText("");
        R2Card1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R2Card1.setOpaque(true);
        R2Card1.setBounds(370, 20, 140, 80);
        jLayeredPane1.add(R2Card1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R2Card2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/StrawberryCardD1.jpg"))); // NOI18N
        R2Card2.setToolTipText("");
        R2Card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R2Card2.setOpaque(true);
        R2Card2.setBounds(370, 100, 140, 80);
        jLayeredPane1.add(R2Card2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R2Card3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/SevenCardD1.jpg"))); // NOI18N
        R2Card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R2Card3.setOpaque(true);
        R2Card3.setBounds(370, 180, 140, 80);
        jLayeredPane1.add(R2Card3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R2Card4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/BellCardD1.jpg"))); // NOI18N
        R2Card4.setToolTipText("");
        R2Card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R2Card4.setOpaque(true);
        R2Card4.setBounds(370, 260, 140, 80);
        jLayeredPane1.add(R2Card4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R2Card5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R2Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/DiamondCardD1.jpg"))); // NOI18N
        R2Card5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R2Card5.setOpaque(true);
        R2Card5.setBounds(370, 340, 140, 80);
        jLayeredPane1.add(R2Card5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R3Card1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/CherryCardD1.jpg"))); // NOI18N
        R3Card1.setToolTipText("");
        R3Card1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R3Card1.setOpaque(true);
        R3Card1.setBounds(510, 20, 150, 80);
        jLayeredPane1.add(R3Card1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R3Card2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/BarCardD1.jpg"))); // NOI18N
        R3Card2.setToolTipText("");
        R3Card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R3Card2.setOpaque(true);
        R3Card2.setBounds(510, 100, 150, 80);
        jLayeredPane1.add(R3Card2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R3Card3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/DiamondCardD1.jpg"))); // NOI18N
        R3Card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R3Card3.setOpaque(true);
        R3Card3.setBounds(510, 180, 150, 80);
        jLayeredPane1.add(R3Card3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R3Card4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/DieCardD1.jpg"))); // NOI18N
        R3Card4.setToolTipText("");
        R3Card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R3Card4.setOpaque(true);
        R3Card4.setBounds(510, 260, 150, 80);
        jLayeredPane1.add(R3Card4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        R3Card5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R3Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slotmachinemain/CoinsCardD1.jpg"))); // NOI18N
        R3Card5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R3Card5.setOpaque(true);
        R3Card5.setBounds(510, 340, 150, 80);
        jLayeredPane1.add(R3Card5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setText("jLabel12");
        jLabel12.setBounds(650, 420, 60, 14);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      if(newPlayer.getPlays()> 0) 
      {
       Random Spin1 = new Random(); 
       Sp1 = Spin1.nextInt(10);
       Random Spin2 = new Random(); 
       Sp2 = Spin2.nextInt(10);
       Random Spin3 = new Random(); 
       Sp3 = Spin3.nextInt(10);
       
       
       
       if(Sp1 == 5 && Sp2 == 2 && Sp3 ==9)
       {
           newPlayer.setPayout(25.00);
           newPlayer.Pay4Win();
       }
       if(Sp1 == 3 && Sp2 == 8 && Sp3 ==1)
       {
           newPlayer.setPayout(10.00);
           newPlayer.Pay4Win();
       }
       if(Sp1 == 1 && Sp2 == 7 && Sp3 ==4)
       {
           newPlayer.setPayout(5.00);
           newPlayer.Pay4Win();
       }
       if((Sp1 == 7 && Sp2 == 2)||(Sp1 == 7 && Sp3 == 9) || (Sp2 == 2 && Sp3 == 9))
       {
           newPlayer.setPayout(.70);
           newPlayer.Pay4Win();
       }
       if((Sp1 == 3 && Sp2 == 8)||(Sp1 == 3 && Sp3 == 1) || (Sp2 == 8 && Sp3 == 1))
       {
           newPlayer.setPayout(1.00);
           newPlayer.Pay4Win();
       }
       if((Sp1 == 1 && Sp2 == 7)||(Sp1 == 1 && Sp3 == 4) || (Sp2 == 7 && Sp3 == 4))
       {
           newPlayer.setPayout(.75);
           newPlayer.Pay4Win();
       }
       
       if((Sp1 == 0 || Sp1 == 1 || Sp1 == 8)&&(Sp2 == 0 || Sp2 == 3 || Sp2 == 7) && (Sp3 == 4 || Sp3 == 5 || Sp3 == 6))
       {
           newPlayer.setPayout(3.00);
           newPlayer.Pay4Win();
       }
       if((Sp1 == 2 || Sp1 == 4 || Sp1 == 6)&&(Sp2 == 1 || Sp2 == 5 || Sp2 == 9) && (Sp3 == 0 || Sp3 == 7 || Sp3 == 8))
       {
           newPlayer.setPayout(.25);
           newPlayer.Pay4Win();
       }
       
       newPlayer.Pay2Play();
        String Cred = Double.toString(newPlayer.getCredit());
       
        Credit.setText("$" + (Cred));
        
        String Sp = Integer.toString(newPlayer.getPlays());
        Spins.setText(Sp);
        
        
        
      Reels spin = new Reels();
      Thread S = new Thread(spin);
      S.start();
      Reels2 spin2 = new Reels2();
      Thread S2 = new Thread(spin2);
      S2.start();
      Reels3 spin3 = new Reels3();
      Thread S3 = new Thread(spin3);
      S3.start();
      Reels4 spin4 = new Reels4();
      Thread S4 = new Thread(spin4);
      S4.start();
      Reels5 spin5 = new Reels5();
      Thread S5 = new Thread(spin5);
      S5.start();
      SReels Sspin = new SReels();
      Thread SS = new Thread(Sspin);
      SS.start();
      SReels2 Sspin2 = new SReels2();
      Thread SS2 = new Thread(Sspin2);
      SS2.start();
      SReels3 Sspin3 = new SReels3();
      Thread SS3 = new Thread(Sspin3);
      SS3.start();
      SReels4 Sspin4 = new SReels4();
      Thread SS4 = new Thread(Sspin4);
      SS4.start();
      SReels5 Sspin5 = new SReels5();
      Thread SS5 = new Thread(Sspin5);
      SS5.start();
      TReels Tspin = new TReels();
      Thread TS = new Thread(Tspin);
      TS.start();
      TReels2 Tspin2 = new TReels2();
      Thread TS2 = new Thread(Tspin2);
      TS2.start();
      TReels3 Tspin3 = new TReels3();
      Thread TS3 = new Thread(Tspin3);
      TS3.start();
      TReels4 Tspin4 = new TReels4();
      Thread TS4 = new Thread(Tspin4);
      TS4.start();
      TReels5 Tspin5 = new TReels5();
      Thread TS5 = new Thread(Tspin5);
      TS5.start();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Card1;
    public static javax.swing.JLabel Card2;
    public static javax.swing.JLabel Card3;
    public static javax.swing.JLabel Card4;
    public static javax.swing.JLabel Card5;
    public static javax.swing.JLabel Credit;
    public static javax.swing.JLabel Payout;
    public static javax.swing.JLabel R2Card1;
    public static javax.swing.JLabel R2Card2;
    public static javax.swing.JLabel R2Card3;
    public static javax.swing.JLabel R2Card4;
    public static javax.swing.JLabel R2Card5;
    public static javax.swing.JLabel R3Card1;
    public static javax.swing.JLabel R3Card2;
    public static javax.swing.JLabel R3Card3;
    public static javax.swing.JLabel R3Card4;
    public static javax.swing.JLabel R3Card5;
    public static javax.swing.JLabel Spins;
    public static javax.swing.JLabel Status;
    public static javax.swing.JLabel TotalW;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables


}


