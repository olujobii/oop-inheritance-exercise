import classExercise1.Child;
import classExercise2.*;
import groupExercise.*;

public class Main {

    public static void main(String[] args) {
        //CLASS EXERCISE 1
        Child child = new Child();
        child.color = "Blue";

        System.out.println("My child's favourite color is "+child.color);

        //CLASS EXERCISE 2
        Bike bike = new Bike();
        bike.color = "Red";
        bike.brand = "Suzuki";

        System.out.println("The color of my bike is "+bike.color+" and the brand is "+bike.brand);
        bike.move();

        Truck truck = new Truck();
        truck.color = "Grey";
        truck.brand = "Nissan";

        System.out.println("The color of my truck is "+truck.color+" and the brand is "+truck.brand);
        truck.move();

        //GROUP EXERCISE
        Student1 student1 = new Student1();
        student1.name = "Ifeoluwa";
        student1.course = "Computer Science";
        student1.id = 10011;

        System.out.println("My name is "+student1.name+" and I am a "+student1.course+" student. My student ID is "
                +student1.id);
        student1.takeCourse();

        Student2 student2 = new Student2();
        student2.name = "Folake";
        student2.course = "Nursing";
        student2.id = 10349;

        System.out.println("My name is "+student2.name+" and I am a "+student2.course+" student. My student ID is "
                +student2.id);
        student2.takeCourse();
    }
}
