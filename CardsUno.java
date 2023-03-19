import java.util.Math;
import java.util.Random;
import java.util.Array;
import java.util.ArrayList;

public class Card
{
    String color;
    int type = 0;
    Array of type Cards        
  //Array of colors  
        List<String> colorsArr = new ArrayList<>();
        colorsArr.add("red");
        colorsArr.add("yellow");
        colorsArr.add("green");
        colorsArr.add("blue");
        colorsArr.add("choice");
  //Array of types
        List<int> typeArr = new ArrayList<>();
        typeArr.add(0);
        typeArr.add(1);
        typeArr.add(2);
        typeArr.add(3);
        typeArr.add(4);
        typeArr.add(5);
        typeArr.add(6);
        typeArr.add(7);
        typeArr.add(8);
        typeArr.add(9);
        typeArr.add(22); //plus 2
        typeArr.add(44); //plus 4
        typeArr.add(40); // reverse
        typeArr.add(23); //skip
        typeArr.add(100); // blank

  //Caution:A type choice must be a plus 4
//CONSTURCTORRREERINO
    Card() //this card now has a color and type (ratios are not added, blank blacks not added)
    {
        color = randColor();
        type = randType();
        //sets blacks to +4
        if (color == "choice" || type == 44)
        {
            type = 44;
            color = "choice";
        }
        if(type == 100)
        {
            color = "choice";
        }
    }
    public Card newCard()
    {
        Card card1 = new Card();
        return card1;
    }

    public String getColor()
    {
        return color;
    }

    public int getType() //done!
    {
        return type;
    }

    public String randColor() //done!
    {
        int dice = random.nextInt(0, 5); //throws a dice
        String randC = colorArr[dice];  //gets the array num in the color arr
        return randC; //r
    }

    public int randType() //done!
    {
        int dice = random.nextInt(0, 12);
        String randT = typeArr[dice];
        return randT;
    }
}