public class IfSwitchExamples{
  public static void main(String[] args){
    int age = 0;
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


    String kado;

    if(age <= 1){kado = "rammelaar";}
    else if(age <= 3){kado = "duplo";}
    else if(age <= 5){kado = "een loopfiets";}
    else if(age <= 8){kado = "een gameboy";}
    else if(age <= 11){kado = "een crossfiets";}
    else if(age <= 15){kado = "geld voor een playstation";}
    else if(age <= 17){kado = "geld voor een brommer";}
    else{ kado = "geld voor mijn rijbewijs";}

    switch(age){
      case 0: case 1:
      kado = "een rammelaar";
      break;
      case 2: case 3:
      kado = "duplo";
      break;
      case 4: case 5:
      kado = "een loopfiets";
      break;
      case 6: case 7: case 8:
      kado = "een gameboy";
      break;
      case 9: case 10: case 11:
      kado = "een crossfiets";
      break;
      case 12: case 13: case 14: case 15:
      kado = "geld voor een playstation";
      break;
      case 16: case 17:
      kado = "geld voor een brommer";
      break;
      default:
      kado = "geld voor mijn rijbewijs";
    }
    System.out.println("Voor mijn " +age+ "e verjaardag heb ik " + kado + " gekregen.");
  }

}
