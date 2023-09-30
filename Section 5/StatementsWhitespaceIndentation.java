public class StatementsWhitespaceIndentation {
 public static void main(String[] args) {
   int variable = 50;
   
   variable++;
   variable--;
   
   System.out.println("This is a test");
   System.out.println("This is" +
                      " another" +
                      " still more.");
   
   int anotherVariable = 50;
   variable--;
   System.out.println("variable = " + variable);
   
   if (variable == 0 ) {
      System.out.println("It's now zero");
   }
 }
}
