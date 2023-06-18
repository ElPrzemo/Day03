import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisuj liczby, podaj zero żeby zakończyć: ");

        int userNumber = getUserNumber(scanner);
        int sum = 0;

        while (userNumber !=0){
            sum +=userNumber;
            System.out.println("Suma Twoich liczb to: " + sum);
            System.out.println("Podaj następną liczbę: ");
            getUserNumber(scanner);
        }
    }

    private static int getUserNumber(Scanner scanner) {
        int userNumber = scanner.nextInt();
        return userNumber;
    }
}
