import java.util.Scanner;

public class GuessingGame {

    int random;
    GuessingGame(){
        random = (int)(Math.random()*100)+1;
    }
    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the Guessing game, please select number from 1-100");
        int guess;
        int result;
        do{
            System.out.print("guess the number :");
            guess = input.nextInt();
            result= game.guess(guess);
            if(result==0){
                System.out.println("Congrats Your guess is correct ");
            }
            else if(result<0){
                System.out.println("Please guess Higher!");
            }else{
                System.out.println("Please guess lower!");
            }

        }while(result!=0);
    }
}
