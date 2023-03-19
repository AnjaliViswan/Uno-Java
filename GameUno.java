import java.util.Scanner;

public class GameUno
{
    public static void main(String [] args)
    {
        //vars
        Player player1 = new Player( "Opo", 1);
        Player player2 = new Player( "Gappy", 2);
        Player player3 = new Player( "Caspy", 3);
        Player player4 = new Player("Rat", 4);
        Card mainDeck = new Hand("deck", 5);
        //main
        drawDeck();
        while( player1.isTurn(turnOver) == false)
        {
            player1.selectCard();
            //create all this to a playeruno method of turn 
            //Card is placed, butn eeds to add check methods
        }
    }


}