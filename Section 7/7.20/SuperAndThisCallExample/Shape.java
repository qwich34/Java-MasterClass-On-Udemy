package SuperAndThisCallExample;
/*
    We have a class Shape, with x and y variables,
    We have a Rectangle child class that extends Shape(parent),
    With variables width and height.

    In the Rectangle class, 1-st constructor is colling the 2-nd constructor
    The 2-nd constructor calls parent constructor with parameters x and y
    The parent constructor will initialize the x and y variables,
    While the 2-nd Rectangle constructor will initialize the width and height vars.

    We can have super() and this() calls, but not at the same time!

 */
public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle (int x, int y) {
        this(x, y, 0, 0);
    }

    public Rectangle (int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
