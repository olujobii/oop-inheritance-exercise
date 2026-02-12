import classExercise1.Child;
import classExercise2.*;

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
    }
}
