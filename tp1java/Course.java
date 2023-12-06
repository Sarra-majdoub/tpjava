public class Course {
    protected int courseId;
    protected String courseName;
    protected Instructor instructor;
    public Course(int courseId,String courseName, Instructor instructor){

        this.courseId=courseId;
        this.courseName=courseName;
        this.instructor=instructor;
    }
    public int getCourseId(){
        return courseId;
    }
    public String getcourceName(){
        return courseName;
    }
    public Instructor getInstructor(){
        return instructor;
    }
    public void Affiche_course(){
        System.out.println("Course ID:"+courseId+",");
        System.out.println("Course name:"+courseName+",");
        instructor.Affiche_instructor();
    }
}
