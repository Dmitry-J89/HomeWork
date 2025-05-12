import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scan.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scan.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);

        String answer;
        do {
            game.play();

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scan.next().toLowerCase();

            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes/no]: ");
                answer = scan.next().toLowerCase();
            }

        } while (answer.equals("yes"));

        scan.close();
    }
}