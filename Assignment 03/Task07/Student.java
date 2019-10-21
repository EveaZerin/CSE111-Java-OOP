public class Student {
    public static int numberOfStudents = 0; /* static means that the changes in this variable with be accessible from all the instances of Student class */
    private String name;

    public Student(){
        this.name = "default name";
        numberOfStudents++;
    }

    public Student(String name){
        this.name = name;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }
}
