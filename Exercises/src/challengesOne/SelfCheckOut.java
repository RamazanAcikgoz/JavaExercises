package challengesOne;

import java.util.Scanner;

/*
Createasimpleself-checkoutsystem.Promptfortheprices and quantities of three items.
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
 Print outthelineitemswiththequantityandtotal,andthenprint outthesubtotal,taxamount,andtotal.

 */
public class SelfCheckOut {
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1 : ");
        Scanner scan = new Scanner(System.in);
        int itemOne = scan.nextInt();
        System.out.println("Enter the quantity of item 1 : ");
        int quantityOne = scan.nextInt();
        System.out.println("Enter the price of item 2 : ");
        int itemTwo = scan.nextInt();
        System.out.println("Enter the quantity of item 2 : ");
        int quantityTwo = scan.nextInt();
        System.out.println("Enter the price of item 3 : ");
        int itemThree = scan.nextInt();
        System.out.println("Enter the quantity of item 3 : ");
        int quantityThree = scan.nextInt();
        int sum = (itemOne*quantityOne)+(itemTwo*quantityTwo)+(itemThree*quantityThree);
        double tax = (sum*5.5) / 100;
        System.out.println("Sub total : " + sum + " $");
        System.out.println("Tax : " + tax + " $");
        System.out.println("Total : " + (sum+tax));



    }
}
