package challengesOne;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        // Example 1 :

        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + " nice to meet you!");

        // Example 2 :

        System.out.println("Please enter your String : ");
        String word = scan.nextLine();
        System.out.println(word + " has " +word.length() + " character");
    }
}
