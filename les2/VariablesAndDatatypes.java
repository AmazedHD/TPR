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
  }

}
