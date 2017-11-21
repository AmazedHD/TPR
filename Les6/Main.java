public class Main{

  public static void main(String[] args){

    Main program = new Main();
    program.run();

  }
  private void run(){
    Student[] students = new Student[5];
    students[0] = new Student(001,"Henk", "Vries de", 65);
    students[1] = new Student(002,"Pietje", "Puk", 45);
    students[2] = new Student(003,"Gekke", "Gerrit", 33);

    students[1].addGrade(new Grade("tpr" ,"P1L4", 7));
    students[1].addGrade(new Grade("tpr" ,"P2L6", 9));
    students[2].addGrade(new Grade("tpr" ,"P1L4", 4));

    students[1].getGrade(0).changeResult(10);

    System.out.println(students[1].getName() +
    "s grade for " +
    students[1].getGrade(0).getCourse() +
    " , " +
    students[1].getGrade(0).getAssignment() +
    " changed to: " +
    students[1].getGrade(0).getResult());
  }

}
