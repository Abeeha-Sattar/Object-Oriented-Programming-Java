import java.util.*;

interface ATM {
  public void insertDebitCard(int ccNumber);
  public void inputPIN(int PIN);
  public void inputAmountToWithdraw(int cashAmt);
}

// classes implement interfaces

class ATM_UBL implements ATM{
  //variable
  //function
  public void insertDebitCard(int ccNumber){
    System.out.println("Card Inserted: " + ccNumber);
  }
  public void inputPIN(int PIN){
    System.out.println("PIN Inserted through keypad: " + PIN);
  }
  public void inputAmountToWithdraw(int cashAmt){
    System.out.println("Cash to be withdrawn: " + cashAmt);
  }
}

class ATM_HBL implements ATM{
  //variable
  //function
  public void insertDebitCard(int ccNumber){
    System.out.println("Card Inserted: " + ccNumber);
  }
  public void inputPIN(int PIN){
    System.out.println("PIN Inserted through touchscreen: " + PIN);
  }
  public void inputAmountToWithdraw(int cashAmt){
    System.out.println("Cash to be withdrawn: " + cashAmt);
  }
}

public class Main {
    public static void main(String[] args) {
      
      ATM atm;
      int choice = 1;
      if (choice == 0)
        atm = new ATM_HBL();
      else
        atm = new ATM_UBL();
        
        
      atm.insertDebitCard(12345);
      atm.inputPIN(1234);
      atm.inputAmountToWithdraw(10000);
      
      
      /*ATM_UBL obj = new ATM_UBL();
        obj.insertDebitCard(12345);
        obj.inputPIN(1234);
        obj.inputAmountToWithdraw(10000);
        
        ATM_HBL obj1 = new ATM_HBL();
        obj1.insertDebitCard(12345);
        obj1.inputPIN(1234);
      obj1.inputAmountToWithdraw(10000);*/
    }
}