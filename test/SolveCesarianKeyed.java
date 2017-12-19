import java.util.ArrayList;
public class SolveCesarianKeyed{
  String alphabet = "abcdefghijklmnopqrstuvwxyz";
  String keyWord = "mediacollege";
  String keyAlphabet = "";

  public static void main(String args[]){
    SolveCesarianKeyed program = new SolveCesarianKeyed();
    String result = program.getKeyAlphabet("media college");
  }
  private String getKeyAlphabet(String keyword){
    char[] ab = this.alphabet.toCharArray();
    char[] kw =keyword.toCharArray();
    String found = "";



    for(char c_kw : kw){
      for(char c_alpha : ab){
        if(c_alpha == c_kw){
          char[] fnd = found.toCharArray();
          int count = 0;
          for(char f : fnd){
            if(f == c_alpha){
              count++;
            }
          }
          if(count == 0){
            found+=c_alpha;
          }

        }
      }
    }
    System.out.println("found chars "+found);
    return found;
  }

}
