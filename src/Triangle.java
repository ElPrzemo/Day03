import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wielkości : ");

        int size = scanner.nextInt();


        for (int i = size; i >= 1; i--) {
            for (int j = size-1; j >= i - 1; j--) {
                System.out.print(" ");
            }
            for (int k = size-1; k > size - i + 1; k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wielkości : ");

        int size = scanner.nextInt();

        for(int i =1; i<=size; i++){
            int numberOfHashes = i;


            for (int j = 1; j<= numberOfHashes; j++){
                System.out.print("#");
            }
            System.out.println();
        }
         */
    }

