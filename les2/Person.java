public class Person{
  private String name;
  private int age;
  private float weight;
  public Person(String name, int age, float weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
  }
  public void showStats(){
    System.out.println(name + " is " + age + " years old and weighs " + weight);
  }
}
