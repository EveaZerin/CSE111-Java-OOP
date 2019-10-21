public class Course {
  
    private String courseName;

    public Course(){   
      // Default constructor
    }
    
    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }
    
}
