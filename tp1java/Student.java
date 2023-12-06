public class Student {
    protected int StudentID;
    protected String firstname;
    protected String lastname;
    protected Course [] courses ;
    protected int size ;

    public Student(int StudentID,String firstname, String lastname){

        this.StudentID=StudentID;
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public int getStudentID(){
        return StudentID ;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public Course[] getCourses(){
        return courses;
    }
    public void enroll(Course course){

        Course[] arrayt = new Course[size + 1];

        for (int i = 0; i <size ; i++) {

            arrayt[i] = courses[i];

        }
        arrayt[size] = course;
        this.courses = arrayt;
        size++;

    }
    public void AfficheCourses(){
        for (int i=0; i<size; i++){
            System.out.println("course n° "+ i+1);
            courses[i].Affiche_course();
        }

    }

}
