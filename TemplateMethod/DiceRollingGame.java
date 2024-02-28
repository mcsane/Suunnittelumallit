import java.util.Random;

class DiceRollingGame extends Game {
    private int[] playerScores;

    @Override
    void initializeGame() {
        System.out.println("Dice Rolling Game Initialized");
        playerScores = new int[playersCount];
        for (int i = 0; i < playersCount; i++) {
            playerScores[i] = 0;
        }
    }

    @Override
    void makePlay(int player) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; 
        playerScores[player] += diceRoll;
        System.out.println("Player " + (player+1) + " rolled a " + diceRoll);
    }

    @Override
    boolean endOfGame() {
        for (int score : playerScores) {
            if (score >= 50) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        System.out.println("Game Over!");
        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] >= 50) {
                System.out.println("Player " + (i+1) + " wins with a score of " + playerScores[i] + "!");
            }
        }
    }
}