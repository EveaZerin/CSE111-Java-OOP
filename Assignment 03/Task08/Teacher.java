public class Teacher {
  private String name="";
  private String department="";
  private int index=0;
  private Course[] courses = new Course[8];  /* 8 because highest number of courses taken is 8. There are other ways of doing this too. You could use String as well. */
  
  public Teacher() {
    // Default constructor
  }
  
  public Teacher(String name, String dept) {
    this.name = name;
    this.department = dept;
  }
  
  public void printDetail(){
    
    System.out.println("========================");
    System.out.println("Name: " + this.name);
    System.out.println("Department: " + this.department);
    System.out.println("List of courses");
    System.out.println("========================");
    
    for(int i = 0; i < courses.length; i++){
      if(courses[i] != null){    // an empty array of objects has null values initially, not 0
        System.out.println(courses[i].getCourseName());
      }
    }
    
    System.out.println("========================");    
  }
  
  public void addCourse(Course c){   // the parameter of this method takes a reference to an object of the type Course
        courses[index] = c;
        index++;    //incrementing for the next course to avail this index
  }
  
}
