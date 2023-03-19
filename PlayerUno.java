import java.util.Scanner;
import java.util.ArrayList;

public class Player
{
    Player(String name, int order) //starts wiwth name, order, false turn, new hand of 7
    {
        this.name = name;
        this.order = order;
        boolean turnOver = false;
        List<Card> hand = new ArrayList<>();
        for(int i = 0; i < 7; i++)
        {
            hand.add(newCard());
        }
    }
    public void deal(Card cardx) // deals from 
    {
        hand.add(cardx)
    }
    public List<Card> getPlayerHand() //gets hand
    {
        return hand;
    }
    public String getPlayerName() //gets name
    {
        return name;
    }
    public int getPlayerOrder() //gets order
    {
        return order;
    }
    public boolean isTurn(boolean turn); //gets if it's their turn. ???check
    {
        return turn;
    }
    public void selectCard() //this goes from 0 but ig u can add 1 and up but thats ambiguous
    {
        //picks an array number in the hand 0 1 2 3 4 number card
        System.out.println("Give an array digit: ");
        Scanner x = new Scanner(System.in);
        int givenInt = x.nextInt();
        //Gets valid card
        while ( givenInt > hand.size() || givenInt < 0 )
        {
            System.out.println("Give a valid array digit: ");
            Scanner x = new Scanner(System.in);
            int givenInt = x.nextInt();
        }
        //checks if card and deck match and adds to deck
        addDeckCard(hand[givenInt]);
        hand.remove(givenInt);
    }
    public void plusTwo()
    {
        hand.add(newCard());
        hand.add(newCard());
    }
    public void plusFour()
    {
        hand.add(newCard());
        hand.add(newCard());
        hand.add(newCard());
        hand.add(newCard());
    }
    //ill do reverse in game
    
}


