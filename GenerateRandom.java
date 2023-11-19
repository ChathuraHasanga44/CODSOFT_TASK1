import java.util.Scanner;  //Import Scanner class

public class GenerateRandom{
    public static void main(String args[]){

        Scanner guess = new Scanner(System.in);    //create Scanner object
        
        System.out.print("Enter guess number: ");
        int rNum = guess.nextInt();

        int min = 1;
        int max = 100;

        int x =(int)(Math.random()*(max-min+1)+ min); 
        
        while (rNum!=x) {
        //print random value.
        System.out.println("Generated random number is : " + x);
        System.out.println();
        
        // System.out.println("Guess number is  : " + rNum);
        // System.out.println("Random number is : "+x);
        System.out.println();


        
        if (rNum<x) {
            System.out.println("Guess number is too low.");
        }else if (rNum>x) {
            System.out.println("Guess number is too high.");
        }else{
            System.out.println("Guess number is correct.");
        }
        
        rNum = guess.nextInt();
    }
    }
}
