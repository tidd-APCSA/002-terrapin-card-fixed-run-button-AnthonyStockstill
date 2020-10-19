public class TerrapinCard {
  
  
  
  
  
  private double balance;
  public TerrapinCard(double itsBalance){
    balance = itsBalance; 
  }
  public String toString(){
      return "The card has " + balance + " dollars";
    }


  public void payEconomical(){
    if (balance>2.50){
      balance-=2.50;
    }
    else {
      balance += 0 ;
    }
  }


  public void payGourmet(){
    if (balance>4.00){
      balance -= 4.00;
    }
    else {
      balance += 0;
    }
  }

  public void loadMoney(double amount){

    if (balance+amount>150){
      balance = 150;
    }
    else if(balance>0){
      balance+=amount;
    }
    else {
      balance+=0;
    }
  }


}
