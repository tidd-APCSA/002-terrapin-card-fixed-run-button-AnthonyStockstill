public class CardRunner {
    public static void main(String args[]){

      TerrapinCard billy = new TerrapinCard(50);
      TerrapinCard brian = new TerrapinCard(50);

      billy.payGourmet();
      brian.payEconomical();
      System.out.println("Billy: " + billy);
      System.out.println("Brian: " + brian);

      billy.loadMoney(28);
      brian.payGourmet();
      System.out.println("Billy: " + billy);
      System.out.println("Brian: " + brian);

      billy.payGourmet();
      billy.payGourmet();
      brian.loadMoney(50);
      System.out.println("Billy: " + billy);
      System.out.println("Brian: " + brian);

    }
}