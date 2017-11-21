import java.util.ArrayList;
public class Student{
  private int _id;
  private String _name;
  private String _lastName;
  private int _age;
  private ArrayList<Grade> _grades;
	public Student(int id, String name, String lastName, int age){
    _id = id;
    _name = name;
    _lastName = lastName;
    _age = age;
    _grades = new ArrayList<Grade>();
  }
  public String getName(){
	   return _name;
  }
  public void addGrade(Grade g){
	   _grades.add(g);
  }
  public Grade getGrade(int number){

	  if(_grades.size() > number){
	      return _grades.get(number);
    }else{
      System.out.println("grade not found @"+ number);
      return null;
    }
    
  }
}
