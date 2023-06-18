public class BreakAndContinue {
    public static void main(String[] args) {

        for (int i = 10; i<20; i++){
            System.out.println("## " + i);
            if (i ==14) {break;}
        }

        System.out.println("I lecimy dalej");

        for(int i =5; i<15; i++){
            if(i ==8){
                continue;
            }
            System.out.println("--> "+i);
        }

        int i = 0;

        while (i<6){
            System.out.println("While::: "+i);
            i++;
            if (i==4){
                break;
            }
        }







    }
        }
