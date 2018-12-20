import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;


public class Main {

    public static class Card {

        public final static int CLUBS = 0, DIAMONDS = 1, HEARTS = 2, SPADES = 3;
        private int value; // between 1 and 13
        private int suit;  // between 0 and 3 (i.e., one of the constants above)

        // Create hashmap to represent 1, 11, 12, 13 in string format
        public HashMap<Integer, String> values = new HashMap<Integer, String>();
        {
            values.put(1, "Ace");
            values.put(11, "Jack");
            values.put(12, "Queen");
            values.put(13, "King");
        }

        // Create hashmap to represent suits string format
        public HashMap<Integer, String> suits = new HashMap<Integer, String>();
        {
            suits.put(0, "Clubs");
            suits.put(1, "Diamonds");
            suits.put(2, "Hearts");
            suits.put(3, "Spades");
        }


        public Card(int value, int suit)
        {
            this.value = value;
            this.suit = suit;
        }

        public int getSuit()
        {

            return this.suit;
        }

        public int getValue()
        {
            return this.value;
        }

        public String toString() // return card in string format
        {
            if (this.value > 1 && this.value < 11) {
                return String.format("%s of %s", this.getValue(), suits.get(this.getSuit()));
            } else {
                return String.format("%s of %s", values.get(this.getValue()), suits.get(this.getSuit()));
            }
        }

    }

    public static class Hand {

        public List<String> lis = new ArrayList<String>();
        public List<Integer> suits = new ArrayList<>();
        public List<Integer> vals = new ArrayList<>();

        public boolean isStraight() {
            Collections.sort(vals);
            int prev = vals.get(0);
            if (prev==1 && vals.get(1)!=2) {
                vals.remove(0);
                vals.add(14);
                prev = vals.get(0);
            }
            for (int i = 1; i < 5; i++) {
                if (vals.get(i)!=prev+1) {
                    return false;
                } else {
                    prev = vals.get(i);
                    if (i == 4) {
                        return true;
                    }
                }
            }
            return false;
        }

        public String isStraightOrFlush() {
            boolean isFlush = suits.stream().distinct().limit(2).count() < 2;
            boolean isStraight = isStraight();

            if (isFlush && isStraight) {
                return "Straight flush";
            } else if (isFlush) {
                return "Flush";
            } else if (isStraight) {
                return "Straight";
            } else {
                return "None";
            }
        }

        public String toString() // return hand in string format
        {
            String s = "";
            for (int i = 0; i < lis.size(); i++) {
                s += String.format("%s, ", lis.get(i));
            }
            return s.substring(0, s.length() - 2);
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // obtain the number of hands
        String temp;

        for( int i = 0; i < n; i++ )
        {
            Main.Hand h = new Main.Hand();

            for( int j = 0; j < 5; j++ )
            {
                int v, s;
                v = in.nextInt();
                s = in.nextInt();
                Main.Card c = new Main.Card(v, s);
                h.suits.add(c.getSuit());
                h.vals.add(c.getValue());
                temp = c.toString();
                h.lis.add(temp);

            }

            System.out.println(h.toString());
            System.out.println(h.isStraightOrFlush());

        }

    }

}