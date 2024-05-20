class Animal {
    int legs =4;
    int eyes=2;
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
    void eat()
    {
        System.out.println("Animal is Eating");
    }
    void Walk(){
        System.out.println("Animal is Walking");
    }
}
class Tiger extends Animal{
    void sleep()
    {
        System.out.println("Tiger is sleeping");
    }
    void eat()
    {
        System.out.println("Tiger is Eating");
    }
    void Walk(){
        System.out.println("Tiger is Walking");
    }
    void run(){
        System.out.println("Tiger is running");
    }

}
class cow extends Animal{
    void sleep()
    {
        System.out.println("Cow is sleeping");
    }
    void eat()
    {
        System.out.println("Cow is Eating");
    }
    void Walk(){
        System.out.println("Cow is Walking");
    }
    void run(){
        System.out.println("Cow is running");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.Walk();
        t.sleep();
        t.run();
        Animal a = new Animal();
        System.out.println(a.eyes);
        System.out.println(a.legs);
        a.eat();
        a.Walk();
        a.sleep();
        cow c = new cow();
        c.eat();
        c.run();
        c.Walk();

    }
}
