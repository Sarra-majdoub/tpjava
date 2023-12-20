interface Quackable {
    void quack();
}

interface Flyable {
    void fly();
}

abstract class Duck {
    protected String nom;

    public Duck(String nom) {
        this.nom = nom;
    }

    public abstract void display();

    public void swim() {
        System.out.println("Swim in Duck class");
    }
}

class MallardDuck extends Duck implements Quackable, Flyable {
    public MallardDuck(String nom) {
        super(nom);
    }

    public void display() {
        System.out.println(" Display() method as a Mallard Duck");
    }


    public void quack() {
        System.out.println("Quack() method in MallardDuck");
    }
    public void fly() {
        System.out.println(" Fly() method in mallarduck");
    }
}

class RedheadDuck extends Duck implements Quackable, Flyable {
    public RedheadDuck(String nom) {
        super(nom);
    }

    public void display() {
        System.out.println(" Display() method in RedheadDuck ");
    }

    public void quack() {
        System.out.println(" Quack() method in RedheadDuck");
    }


    public void fly() {
        System.out.println( "Fly() method in RedheadDuck");
    }
}

class RubberDuck extends Duck implements Quackable {
    public RubberDuck(String nom) {
        super(nom);
    }


    public void display() {
        System.out.println("Display() method in RubberDuck Class ");
    }

    public void quack() {
        System.out.println("Quack() method in RubberDuck Class");
    }
}

class DecoyDuck extends Duck {
    public DecoyDuck(String nom) {
        super(nom);
    }

    public void display() {
        System.out.println(" Display() method in DecoyDuck Class");
    }


    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck("mallard");
        RedheadDuck redheadDuck = new RedheadDuck("redhead");
        RubberDuck rubberDuck = new RubberDuck("rubber");
        DecoyDuck decoyDuck = new DecoyDuck("decoy");

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();
        mallardDuck.swim();

        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.fly();
        redheadDuck.swim();

        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();

        decoyDuck.display();
        decoyDuck.swim();
    }
}
