
public class MyProgram{
  public static void main(String args[]){

    //greet("Jamiro");

    MyProgram mp = new MyProgram();
    mp.greet("jamiro");

    MyProgram mp2 = new MyProgram();
    mp2.greet("jamiro");


  }
  private void greet(String name){
    System.out.println("Hello "+name);
  }

}
