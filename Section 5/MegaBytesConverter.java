public class MegaBytesConverter {
   public static void printMegaBytesAndKiloBytes(int value){
    
    if(value < 0){
         System.out.println("Invalid Value");
    }else{
    
      double megaBytes = value / 1024;
      int kylobytesleft = value % 1024;
      
      System.out.println(value + " KB = " + (int)(megaBytes) + " MB and " + kylobytesleft + " KB");
   }
  }
} 