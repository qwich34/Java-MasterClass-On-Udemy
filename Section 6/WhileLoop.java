import java.util.Arrays;

public class WhileLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            System.out.println("i: " + i);
        }

        System.out.println();

        int j = 1;
        while(true){
            if(j > 5){
                break;
            }
            System.out.println("j1: " + j);
            j++;
        }

        System.out.println();

        j = 1;
        boolean isReady = false;
        do{
            if(j > 5){
                break;
            }
            System.out.println("j2: " + j);
            j++;
            isReady = (j > 0);
        } while(isReady);

        System.out.println("\n\n");

        int num = 0;
        while(num < 50){
            num += 5;
            if(num % 25 == 0) {
                continue;
            }
            System.out.print(num + "_");

        }
    }
}