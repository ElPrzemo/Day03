import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość: ");
        int height = scanner.nextInt();

        System.out.println("Podaj szerokość: ");
        int width = scanner.nextInt();

        // prostokąt z jednym sterowanym bokiem

        for (int i = 0; i<height; i ++) {
            for(int j = 0; j <width; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
