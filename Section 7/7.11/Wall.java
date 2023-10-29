public class Wall {
    private double width; //instance variable
    private double height;//instance variable

    public Wall(){ //No args constructor

    }

    public Wall(double width, double height) {
        if(width < 0) width = 0;
        this.width = width;
        if(height < 0) height = 0;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) width = 0;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) height = 0;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
