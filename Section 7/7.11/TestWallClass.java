public class TestWallClass {
    public static void main(String[] args) {
        Wall small = new Wall(12.1,141.34);
        System.out.println(small);

        Wall wrongWall = new Wall(-2,-1);
        System.out.println(wrongWall);
    }
}
