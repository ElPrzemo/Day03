public class ArraysAndLoops {
    public static void main(String[] args) {

        int tabLength=4;

        String[] names = new String[tabLength];

        names[0] = "Tom";
        names[3] = "Andrew ";

        for (int i =0; i<tabLength; i++){
            System.out.println("Element numer " + i+  " : " + names[i]);
        }

        for (String name: names ) {
            System.out.println(name);
        }

    }
}
