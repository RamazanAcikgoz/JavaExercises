package challengesOne;

import java.util.Scanner;

public class MagicEightBall {
    public static void main(String[] args) {

            for(int i = 0; i<11; i++) {
                Scanner scan = new Scanner(System.in);
                System.out.println("What's your question?");
                String answer = scan.nextLine();
                String[] oldAnswers = new String[10];


                String[] answers = {"Yes", "No", "Maybe", "Ask again later"};
                int oneLate = answers.length;
                int ans = (int) (Math.random() * oneLate);

                answer = answers[ans];
                System.out.println(answer);

                oldAnswers[i] = answer;

            }

    }
}
