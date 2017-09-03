public class Beer{
  private int ml = 330;
  public Beer(){

  }
  public void drink(){
    if(ml >= 10){
      ml -= 10;
      System.out.println("gluck");
    }
    else{
      System.out.println("Can't drink from an empty bottle");
    }
  }
}
