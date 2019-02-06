/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {
    
    /**
     * This main method simply calls the method aliceAndBob.
     */
    public static void main(String[] args ){
        aliceAndBob();
    }
    
    /**
     * This method asks the user what their name is. If the user's name is
     * "Alice" or "Bob", then it greets the user with "Hello!". In every
     * other case, it says "You are not Alice or Bob."
     */
    public static void aliceAndBob(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?\n");
        String name = input.next();
        
        if (name.equals("Alice") || name.equals("Bob")){
            System.out.print("Hello!\n");
        }
        
        else{
            System.out.print("You are not Alice or Bob.\n");
        }
    }
}