 //card class formatting
public class Card{
  public String suit;
  public String val;
  public Card(String v, String s){
    val = v;
    suit = s;
    }
    
    @Override
    public String toString() {
      return val + " of " + suit;
    }
}