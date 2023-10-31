public class Card{
  
  private String value;
  private String suit;
  private int int_val;
  private int int_suit;
  private String[] suits = {"♠️", "♣️", "♦️", "♥️"};
  private String[] values = {"Joker", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

  public Card(int v, int s){
    int_val = v;
    int_suit = s;
    value = values[v];
    suit = suits[s];
  }

  public String getSuitSymbol(){
    return suit;
  }

  public String getValSymbol(){
    return value;
  }

  public int getIntSuit(){
    return int_suit;
  }

  public int getIntValue(){
    return int_val;
  }

  public String toString(){
    return value + " of " + suit;
  }
}