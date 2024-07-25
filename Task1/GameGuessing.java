import java.util.Scanner;

public class GameGuessing {
        public static void guessNumber() {
                int count = 8;
                int number = 1+(int)(100*Math.random());
                int guess;
                int i;
        Scanner sc = new Scanner(System.in);


        for(i=0; i<count; i++) {
                System.out.println("Guess the number ");
                guess = sc.nextInt();

                if(number == guess) {
                        System.out.println("Guess the number is correct ");
                        break;

                }else if(number > guess && i != count-1) {
                        System.out.println("The number is too high ");

                }else if(number < guess && i != count-1) {
                        System.out.println("The number is too low ");
                }

        }
        if(i == count) {
                System.out.println("You have Exceed your limit");
                System.out.println("The number is "+number);
        }

        }
        public static void  main(String[] args) {
                guessNumber();
        }
}

