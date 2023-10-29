package GoodConstructorClass;

/*
    In this example we still have three constructors
    The first constructor calls the second constructor,
    The seconds constructor calls the third constructor,
    The third constructor initializes the instance variables.

 */
public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
        this(0,0); //calls 2nd constructor
    }

    public Rectangle(int width, int height) {
        this(0,0,width,height); //calls 3rd constructor
    }

    public Rectangle(int x, int y, int width, int height) {
        //Initialize variable
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

