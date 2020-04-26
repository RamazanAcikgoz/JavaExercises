//Calculate to leap years
//Genel bir kural olarak artık yıllar 4 rakamının katı olan yıllardır:
//
//1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 gibi.
//Ancak bu kuralın iki istisnası vardır:
//
//1. 100ün katı olan yıllardan sadece 400e kalansız olarak bölünebilenler artık yıldır:
//
//Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
//Sadece 400e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil,
//yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
//
//2. Hesabı daha da hassas hâle getirmek için -400e kalansız bölünebildiği halde- 4000e kalansız olarak bölünebilen yıllar artık yıl kabul edilmez:[1]
//
//Örneğin 4000, 8000, 12000, 16000, 24000, 32000 ve 48000 yılları 400e tam bölünebildiği halde artık yıl kabul edilmeyecektir.

public class leapYear {

    public static void main(String[] args) {
        int deneme = 2016;

        calculateLeapYear(deneme);

    }

    public static void calculateLeapYear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " Its a leap year");
        } else {
            System.out.println(year + " Its not a leap year");
        }

    }

}