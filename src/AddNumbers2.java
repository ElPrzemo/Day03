import java.util.Scanner;

public class AddNumbers2 {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.println("Wpisz swoją liczbę, aby zakończyć program wpisz 0: ");
            userNumber = scanner.nextInt();
            sum += userNumber;

        } while (userNumber != 0);
        System.out.println("Suma to: " + sum);
    }


}
