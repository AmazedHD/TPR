package animals;

import java.util.ArrayList;
import vegetables.Carrot;
public class Rabbit{
  public Rabbit(){

  }
  public void eat(int amount, ArrayList<Carrot> carrots){
    if(carrots.size() == 0){
      System.out.println("nothing to eat");

    }else{
      int i = 0;
      while(i < amount && carrots.size()>0){
        carrots.get(0).eat();
        carrots.remove(0);
        i++;
      }
    }
  }
}
