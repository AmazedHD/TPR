public class VariablesAndDatatypes{
    public static void main(String args[]){
      //Variabelen met verschillende datatypes
      //Optioneel worden daar de waarden aan toegekend met behulp van = met daarachter de nieuwe waarden
      //Let op dat je bij het toekennen van een String "" double quotes gebruikt
      String thePersonName = "Klaas";
      int thePersonAge = 38;
      float thePersonWeight = 82.4f;

      //Het printen van de waarde van een variabele naar de command prompt
      System.out.println("Hello my name is "+ thePersonName);

      thePersonWeight += 10; //tel 10 op bij de waarde van thePersonWeight
      System.out.println("My weight has increased to " + thePersonWeight);

      thePersonAge += 1; //tel 1 op bij de waarde van thePersonAge
      System.out.println("I'm getting older. I am now "+ thePersonAge);

      //Het aanmaken van een object van het type Person
      Person henk = new Person("Henk", 20, 76.5f);
      //Person is een datatype dat ik zelf heb gemaakt dankzij Person.java

      //het Person datatype bevat een functie showStats() die kan worden uitgevoerd
      henk.showStats();

      Person piet = new Person("Piet", 55, 57.5f);
      piet.showStats();

      /*
      Beantwoord de onderstaande vragen en voer de opdrachten uit.
      Geef antwoorden op vragen door ze te printen naar de command prompt met System.out.println();
      Als je dit gedaan hebt gedaan kun je het achievement "variables & datatypes basics" af laten tekenen bij de docent.
      */

      //Vraag 1: Wat is het gewicht van de persoon met de naam "Klaas"?
      System.out.println("je antwoord hier");

      //Vraag 2: Wat is de leeftijd van de persoon met de naam "Piet"?
      System.out.println("je antwoord hier");

      //Opdracht 1: Maak 3 variabelen: myName, myAge en myWeight. Zorg dat ze het juiste datatype hebben en vul als waarden je eigen gegevens in.

      //Opdracht 2: Verhoog met een regel code de waarde van myAge met 1

      //Opdracht 3: Zoek uit wat de mogelijke waarden zijn van het datatype "boolean". Maak een variabele aan waarin je informatie over jezelf opslaat met een boolean.

      //Opdracht 4: Maak een nieuwe variabele van het datatype "Person" aan, vul je eigen gegevens in bij deze persoon

      int mysteryType = -1.472727393d;
      //Opdracht 5:
      //Het bovensraande datatype klopt niet met de waarde. Als je de code probeert te compileren zul je daarom ook een error krijgen.
      //Zoek uit welk datatype het getal 1.472727393d moet hebben en verander het datatype naar het juiste.

      //Vraag 3: Bedenk en leg uit waarom er een d achter het getal in opdracht 5 staat.
      System.out.println("je antwoord hier");

      //Vraag 4: Kun je ook uitleggen waarom de waarde van de variabele theWeight een f achter het getal heeft staan? leg uit.
      System.out.println("je antwoord hier");

  }

}
