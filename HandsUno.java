import java.util.ArrayList;
import java.util.Scanner;
public class HandsUno
{
    Hand()
    {
        List<Card> deck = new ArrayList<>();
    }
    public drawDeck()
    {
        deck.add(newCard());
    }
    public void addDeckCard(Card cardx)
    {
        //If the card matches the deck card, remove deck card and add the new card.
        if (cardx.getColor() == deck[0].getColor() || cardx.getType() == 
            deck[0].getType() || cardx.getColor() == "choice")
            {
                deck.add(cardx);
                deck.remove(0);
                if(cardx.getColor() == "choice")
                {
                    System.out.println("Choose color: ");
                    Scanner x = new Scanner(System.in);
                    String newType = x.nextLine();
                }
            }
    }

}
