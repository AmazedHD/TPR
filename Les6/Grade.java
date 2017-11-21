public class Grade{
  private String _courseCode;
  private String _assignmentCode;
  private float _result;
  public Grade(String courseCode, String assCode, float result){
    _courseCode = courseCode;
  	_assignmentCode = assCode;
  	_result = result;
  }
  public void changeResult(float newGrade){
  	_result = newGrade;
  }
  public float getResult(){
  	return _result;
  }
  public String getCourse(){
  	return _courseCode;
  }
  public String getAssignment(){
  	return _assignmentCode;
  }

}
