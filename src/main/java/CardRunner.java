public class CardRunner {
    public static void main(String args[]){
        TerrapinCard card = new TerrapinCard(5);
        card.loadMoney(5);
        System.out.println("Billy: " + card);
    }
}