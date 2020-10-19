public class TerrapinCard {
  private double balance;
  public TerrapinCard(double balanceAtStart){
        balance = balanceAtStart;
  }
  public void payEconomical(){
    balance -= 2.50;
  }
  public void payGourmet(){
    balance -= 4;
  }
  public String toString(){
      return "The card has " + balance + " dollars";
  }
  
  
  


}
