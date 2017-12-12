import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    ArrayList<Carrot> pinkcarrots = new ArrayList<Carrot>();
    ArrayList<Carrot> orangecarrots = new ArrayList<Carrot>();
    Rabbit[] rabbits = new Rabbit[1];

    rabbits[0] = new Rabbit();
    for(int i = 0; i < 10; i++){
      pinkcarrots.add(new Carrot());
      orangecarrots.add(new Carrot());
    }
    rabbits[0].eat(4,pinkcarrots);
    rabbits[0].eat(2,orangecarrots);

  }
}

//Opdracht 1:
//Los de 3 fouten op die allemaal te maken hebben met "scope"

//Opdracht 2:
//Plaats de Carrot class in een map die "vegetables" heet en de Rabbit class in een map met de naam "animals"
//Zorg ervoor dat de namespace van deze classes correct wordt aangepast zodat de compiler deze classes weer kan vinden.

//Opdracht 3:
//Zorg dat het konijn wat vriendjes krijgt! Die mogen ook een paar wortels eten.
