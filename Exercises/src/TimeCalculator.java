public class TimeCalculator {
    // Create a method called getDurationString with parameter
    // First parameter minutes, 2nd parameter seconds(int)
    // You should validate that the first parameter minute>=0
    // You should validate that the 2nd parameter seconds >=0 and <=59
    // If the parameters are valid then calculate how many hours
    // minutes and seconds equal the minutes and seconds passed to
    // this method and return that value as string in format "XXh YYm ZZs"
    // where XX represent a number of hours, YY the minutes and ZZ the seconds
    //
    // Create a 2nd method of the same name but with only one parametere seconds
    // Validate that is >=0, and return "Invalid value" if it is not true
    // If it is valid, then calculate how many minutes are in the seconds value and
    // then call the other overloaded method passing the correct minutes and seconds
    // calculated so that it can calculate correctly.
    // Call both methods to print values to the console
    //
    // Tips : Use int or long data types
    // 1 minute = 60 seconds and 1 hour = 60 minute or 3600 second
    // Methods should be static

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.printf(getDurationString(3945));

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSecond = seconds % 60;
        return getDurationString(minutes, remainingSecond);
    }
}

