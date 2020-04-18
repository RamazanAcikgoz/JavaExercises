package challengesOne;


import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String sOne = scan.nextLine();
        System.out.println("Enter second word");
        String sTwo = scan.nextLine();

        if(isAnagram(sOne,sTwo)){
            System.out.println("Words are an anagram");
        }else{
            System.out.println("Words are not an anagram");
        }
    }
    static boolean isAnagram(String word,String wordTwo){
        if(word.length() != wordTwo.length()){
            System.out.println("Not an anagram");
        }
        char[] sOne = word.toCharArray();
        char[] sTwo = wordTwo.toCharArray();
        Arrays.sort(sOne);
        Arrays.sort(sTwo);
        return Arrays.equals(sOne,sTwo);
    }
}
