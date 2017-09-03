public class Person{  //Naam van de class oftewel het nieuw datatype

  //Variabelen waaruit Person is opgebouwd
  private String name;
  private int age;
  private float weight;

  //Een zogenaamde "constructor". Een "functie" met de naam van de class
  //Hiermee kan de informatie over de Person worden toegekend aan de variabelen
  public Person(String name, int age, float weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }
  //Nog een functie voor het datatype Person
  //Functies worden in week 4 behandeld
  public void showStats(){
    System.out.println(name + " is " + age + " years old and weighs " + weight);
  }
}
