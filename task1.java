import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int input_Number;
    public int No_ofGuesses = 0;

    public int getNoOfGuesses() {
        return No_ofGuesses;
    }

    public void setNoOfGuesses(int No_ofGuesses) {
        this.No_ofGuesses = No_ofGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserInput() {
        System.out.println(" ** Guess The number **");
        Scanner Sc = new Scanner(System.in);
        input_Number = Sc.nextInt();
    }

    boolean isCorrectNumber() {
        No_ofGuesses++;
        if (input_Number == number) {
            System.out.format("Yes, you guessed right! It was %d. You guessed it in %d attempts\n", number, No_ofGuesses);
            return true;
        } else if (input_Number < number) {
            System.out.println("Too low....");
            
        } else if (input_Number > number) {
            System.out.println("Too high....");
            
        }
        return false;
    }
}

public class task1 {
    public static void main(String[] args) {

        
        Game g = new Game();
        boolean b = false;

        while (!b) {
            g.takeuserInput();
            b = g.isCorrectNumber();
        }
    }
}



