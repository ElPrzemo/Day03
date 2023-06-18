import java.util.Arrays;

public class ArraysInJava {

    public static void main(String[] args) {
        int a = 54321;

        int[] myIntArray = new int[4];

        myIntArray[0]=321;
        myIntArray[1]=543;
        myIntArray[2]=456;

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);

        int [] anotherArray = new int[2];

        System.out.println("AnotherArray[0]: " + anotherArray[0]);
        System.out.println("AnotherArray[1]: " + anotherArray[1]);

        int x;
        //tak sie nie da, bo x nie ma wartosci
//        System.out.println(x);

        String[] stringArray = new String[3];

        stringArray[0] = "Hi";
        stringArray[1] = "Hello";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);


        System.out.println(stringArray.length);

    }
}
