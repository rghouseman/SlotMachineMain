
package slotmachinemain;

import java.text.DecimalFormat;

public class Accounts  {
   static double House;
    static double Credit;
    static double Payout;
    static double Deposit;
    static double Plays;
    static double TotalW;
    
    
    
  public Accounts()
  {
      House = 1000000.00;
      Credit = 5.00;
      Deposit = .25;
      Plays = Credit / .25;
  }
  
  public void setHouse(double HouseIn)
  {
      House += HouseIn;
  }
  
  public double getHouse()
  {
       
              return House;
  }
  
  public void setWallet(double CreditIn)
  {
      Credit += CreditIn;
  }
  
  public double getCredit()
  {
              return Credit;
  }
  
  public void Pay2Play()
  {
      Credit -= Deposit;
      House += Deposit;
  }
  
  public void Pay4Win()
  {
      Credit += Payout;
      House -= Payout;
      TotalW += Payout;
  }
  
  public void setPayout(double WinAmount)
  {
      Payout = WinAmount;
  }
  
  public double getPayout()
  {
      return Payout;
  }
  
  public int getPlays()
  {
      Plays = Credit/.25;
      int p = (int)Plays;
      return p;
  }
   
  public double getTotalW()
  {
      return TotalW;
  }
}
