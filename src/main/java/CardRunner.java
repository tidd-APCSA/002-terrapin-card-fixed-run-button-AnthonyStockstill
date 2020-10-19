public class CardRunner {
    public static void main(String args[]){

      TerrapinCard cardBilly = new TerrapinCard(50);
      TerrapinCard cardBrian = new TerrapinCard(50);

      cardBilly.payGourmet();
      cardBrian.payEconomical();
      System.out.println("Billy; " + cardBilly);
      System.out.println("Brian; " + cardBrian);

      cardBilly.loadMoney(28);
      cardBrian.payGourmet();
      System.out.println("Billy; " + cardBilly);
      System.out.println("Brian; " + cardBrian);

      cardBilly.payGourmet();
      cardBilly.payGourmet();
      cardBrian.loadMoney(50);
      System.out.println("Billy; " + cardBilly);
      System.out.println("Brian; " + cardBrian);

    }
}