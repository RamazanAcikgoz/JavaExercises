public class evenNumber {
    public static void main(String[] args) {
        int number =4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number<=finishNumber){
            number++;
            if(!isEvenNumner(number)){
                continue;
            }else{
                evenNumbersFound++;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total number of Even numbers : " + evenNumbersFound);

    }
    public static boolean isEvenNumner(int number){
        if((number%2)==0){
            return true;
        }else {
            return false;
        }

    }
}
