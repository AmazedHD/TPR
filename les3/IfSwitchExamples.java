public class IfSwitchExamples{
  public static void main(String[] args){
    int age = 18;
    String sex = "woman";
    boolean pregnant = false;
    Beer beer = new Beer();

    if(age >= 18){
      if(sex == "man"){
        beer.drink();
      }
      else if(pregnant == true){
        System.out.println("You shouldn't drink when you're pregnant!");
      }else{
        beer.drink();
      }
    }
    else{
      System.out.println("You're too young to drink!");
    }

  }
}
