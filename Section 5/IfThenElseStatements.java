public class IfThenElseStatements {
   public static void main(String[] args) {
   
      boolean gameOver = true;
      int score = 300;
      int levelCompleted = 4;
      int bonus = 300;

      if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
      }else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        }else {
            System.out.println("Got here");
     }
  }
}
