public class Main {
    public static void main(String[] args) {

        /*Bank a=new Bank(5,"sarroura",500);
        Bank b=new Bank(8,"iyed",10);
        a.deposit(200);
        a.withdraw(100);
        a.withdraw(800);*/

        /*
        CustomArrayList array= new CustomArrayList();
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(6);

        for (int i=0; i<array.size();i++){

            System.out.print( array.get(i)+" ");
        }
        System.out.print("\n");

        System.out.println( "is 5 in array ? " + array.isln(5) );
        System.out.println( "size of array;"+array.size() );
        array.add(0,3);
        for (int i=0; i<array.size();i++){

            System.out.print( array.get(i)+" ");
        }
        System.out.print("\n");

        System.out.println( "size of array;"+array.size() );
        System.out.println( "l'index de 4 est :" + array.find(4) );
        array.remove(6);
        System.out.println( "size of array:"+array.size() );
        for (int i=0; i<array.size();i++){

            System.out.print( array.get(i)+" ");
        }
    }*/

        Instructor I1= new Instructor(70,"jhon","White");
        Student s1= new Student(500, "Sarra","Majdoub");
        Course c1=new Course(10,"Math",I1);
        s1.enroll(c1);

        s1.AfficheCourses();

        Instructor I2= new Instructor(71,"Mike","Dark");
        Student s2= new Student(501, "Iyed","Abdeli");
        Course c2=new Course(15,"Phy",I1);
        s2.enroll(c2);

        s2.AfficheCourses();

    }
}