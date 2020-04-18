package challengesOne;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        System.out.println("Press C to convert from Fahrenheit to Celsius .");
        System.out.println("Press F to convert from Celsius to Fahrenheit .");
        choice = scan.nextLine();

        if(choice.toLowerCase().equals("c")){
            System.out.println("Your Choice : C");
            System.out.println("Please enter the temperature in Fahrenheit :");
            double fahren = scan.nextDouble();
            double result = (fahren-32)*5/9;
            System.out.println("The temperature in Celsius : " + result);
        }else if(choice.toLowerCase().equals("f")){
            System.out.println("Your Choice : F");
            System.out.println("Please enter the temperature in Celsius");
            double celsi = scan.nextDouble();
            double res = (celsi*9/5)+32;
            System.out.println("The temperature in Fahrenheir : " + res);
        }
    }
}
