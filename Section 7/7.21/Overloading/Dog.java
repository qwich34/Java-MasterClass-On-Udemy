package Overloading;

    /*
    Same name but different parameters for the methods
     */

public class Dog {

    public void bark() {
        System.out.println("Woof");
    }

    public void bark(int number) {
        for(int i = 0; i < number; i++) {
            System.out.println("Woof");
        }
    }
}
