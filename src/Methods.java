import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
       //wywołanie metody
        Scanner scanner = new Scanner(System.in);
        System.out.println("Przedstaw się");

        String userName = scanner.nextLine();

        sayHelloTo(userName);

        int x = getMySecretNumber();
        System.out.println("x: " + x);
    }

    static int getMySecretNumber (){
        return 7312;
    }

    //deklaracja metody - stworzenie metody, jeszcze nie użycie
    static void sayHello(){
        System.out.println("Cześć");
    }

    static void displayline(){
        for (int i=0; i <40; i++){
            System.out.print("-");
        }
    }


    static void sayHelloTo (String name){
        System.out.println("Witaj: " + name);
    }
}
