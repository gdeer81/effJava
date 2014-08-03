import javax.smartcardio.Card;
import java.util.*;

/**
 * Created by ChrisPound
 * Date: 8/3/2014.
 */
public class item46_prefer_foreach_loops {
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING }
    static Collection<String>  data = new ArrayList<String>();
    static String[] arrayData = {"effective", "java"};
    public static void main(String[] args) {
            for(Iterator i = data.iterator(); i.hasNext();){

            }

        for(int i = 0; i < arrayData.length; i++){

        }

        for(String item: data){

        }

        for(String item: arrayData){

        }

        System.out.println("What happens here? Do we get the expected result?");
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<Card>();
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
                deck.add(new Card(i.next(), j.next()));
    }

     private static class Card  {
         private Card(Suit suit, Rank rank) {

         }
     }

}

