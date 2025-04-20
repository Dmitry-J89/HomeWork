public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = 75;
        int guess = 10;

        while (guess != secretNumber) {
            if (guess > secretNumber) {
                System.out.println(guess + " больше того, что загадал компьютер");
                guess--;
            } else {
                System.out.println(guess + " меньше того, что загадал компьютер");
                guess++;
            }
        }

        System.out.println("Вы победили!");
    }
}