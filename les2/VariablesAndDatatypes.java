public class VariablesAndDatatypes{
    public static void main(String args[]){
      String theName = "Klaas";
      int theAge = 38;
      float theWeight = 82.4f;
      System.out.println("Hello my name is "+ theName);

      theWeight = theWeight + 10;
      System.out.println("My weight has increased to " + theWeight);

      theAge += 1;
      System.out.println("I'm getting older. I am now "+ theAge);

      Person henk = new Person("Henk", 20, 76.5f);
      henk.showStats();

      //Beantwoord de onderstaande vragen en voer de opdrachten uit.
      //Als je dit gedaan hebt kun je het achievement "variables & datatypes basics" af laten tekenen:

      //Wat is het gewicht van de persoon met de naam Klaas?
      //Wat is de leeftijd van de persoon met de naam Klaas?
      //Maak 3 variabelen myName, myAge en myWeight. Vul daar je eigen gegevens in
      //Verhoog in een nieuwe regel code de waarde van myAge met 1
      //Maak ook een nieuwe variabele van het datatype persoon aan, vul je eigen gegevens in bij deze persoon

  }

}
