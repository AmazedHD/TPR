import java.util.Random;
public class Persoon{
  private String _haarKleur = "";
  public String _ogenKleur = "";
  private int _leeftijd = 20;
  public Persoon(){

  }
  public void changeHairColor(String color){
    _haarKleur = color;
    System.out.println("haircolor changed to "+color);
  }
  public boolean heeftVogelgriep()
  {
    Random r = new Random();
    return r.nextBoolean();

  }
/*  public void setLeeftijd(int leeftijd){
    if(leeftijd < 150){
      _leeftijd = leeftijd;
    }else{
      System.out.println("Das veel te oud! klopt dat wel?");
    }

  }*/
  public int getLeeftijd(){
    return _leeftijd;
  }
}
