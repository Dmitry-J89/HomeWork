public class GuessNumber {

    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(java.util.Scanner scan) {
        targetNumber = (int) (Math.random() * 100) + 1;

        Player currentPlayer = player1;

        while (true) {
            System.out.print(currentPlayer.getName() + ", введите число: ");
            int guess = scan.nextInt();
            currentPlayer.setNumber(guess);

            if (guess == targetNumber) {
                System.out.println("Поздравляем, " + currentPlayer.getName() + "! Вы угадали число.");
                break;
            } else {
                System.out.println("Неверно! Ход переходит другому игроку.");
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
}