import java.util.Random;
import java.util.Scanner;

public class RandomQuess {

    public static void main(String[] args)  {

        /*
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        int result = (int) (Math.random() * 10 + 1);

        do {
            System.out.println("Cześć zgadnij liczbę: ");
             userNumber = scanner.nextInt();
            System.out.println("Spróbuj ponownie");

        }while (result != userNumber);
        {
            System.out.println("Brawo użytkowniku zgadłeś liczbę");
            System.out.println("Wylosowana liczba to: " + result);
        } */


        Random random = new Random();
        int randomValue = random.nextInt(11);

        System.out.println("Cześć , zgadnij wylosowaną liczbę: ");

        Scanner scanner = new Scanner(System.in);
        int userQuess = scanner.nextInt();


        while (userQuess !=randomValue){
            System.out.println("Spróbuj jeszcze raz");
            userQuess = scanner.nextInt();
        }

        System.out.println("Brawo użytkowniku zgadłeś.  Wylosowana liczba to: " + randomValue );



}}
