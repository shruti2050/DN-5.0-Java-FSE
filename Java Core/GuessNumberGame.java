import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame {
    public static void main(String args[]){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int guess;
        System.out.println("Guesss Number Game!!");
        System.out.println("Guess number between 1 to 100:");
        
        while(true){
            guess = sc.nextInt();
            if(guess < number){
                System.out.println("too low");
            }else if(guess > number){
                System.out.println("too high");
            }else{
                System.out.println("congratualations you guessed the correct number!!");
                break;
            }
        }
        sc.close();
    }
}
