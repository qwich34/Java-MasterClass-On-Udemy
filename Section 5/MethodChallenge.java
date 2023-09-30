public class MethodChallenge {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
            displayHighScorePosition("Sanya", position);
            
        position = calculateHighScorePosition(999);
            displayHighScorePosition("Gena", position);
            
        position = calculateHighScorePosition(499);
            displayHighScorePosition("Victor", position);
            
        position = calculateHighScorePosition(99);
            displayHighScorePosition("Petr", position);
            
        position = calculateHighScorePosition(-1000);
            displayHighScorePosition("Kirkorov", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("\n" + playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
