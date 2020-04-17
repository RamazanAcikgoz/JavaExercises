package challengesOne;

import java.util.Scanner;

/*
    Createaprogramthatcomputessimpleinterest.Promptfor theprincipalamount,therateasapercentage,andthetime,
    anddisplaytheamountaccrued(principal+interest).

    Theformulaforsimpleinterestis A = P (1+ rt ),
    where P is the principal amount,r is the annual rate of interest,t is the number of years the amount is invested,and
    A is the amount at the end of the investment.

 */
public class SimpleInterest {
    public static void main(String[] args) {
        double a,p,r,t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal : ");
        p = scan.nextDouble();
        System.out.println("Enter the rate of interest : ");
        r = scan.nextDouble();
        System.out.println("Enter the number of years : ");
        t = scan.nextDouble();
        a = (p *(1+ r*t))/100;

        System.out.println("After " + t + " years at " + r + "%, the investment will be worth " + (a+p));
    }
}
