public class TerrapinCard {
  private double balance;
  public TerrapinCard(double balanceAtStart){
        balance = balanceAtStart;
  }
  public void payEconomical(){
    if(balance >=2.50){
    balance -= 2.50;
    }else{
      balance -= 0;
    }
  }
  public void payGourmet(){
    if (balance >= 4){

      balance -= 4;
    }else{
      balance -= 0;
    }
    
  }
  public void loadMoney(double amount){
    if(amount <= 0){
      balance += 0;
    }else{
      balance += amount;
    }
  }
  public String toString(){
      return "The card has " + balance + " dollars";
  }
  
  
  


}
