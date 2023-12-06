public class Instructor {
    protected int InstructorID;
    protected String firstname;
    protected String lastname;
    public Instructor(int InstructorID, String firstname, String lastname){

        this.InstructorID=InstructorID;
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public int getInstructorID(){
        return InstructorID;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void Affiche_instructor(){

        System.out.println("Instructor ID for this course :"+InstructorID+",");
        System.out.println("First name of the  instructor :"+firstname+",");
        System.out.println("Last name of the instructor:"+lastname+",");

    }


}
