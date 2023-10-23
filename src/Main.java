public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
        System.out.println("задача 2");
        for (int numberr = 10; numberr >= 1; numberr--) {
            System.out.println(numberr);
        }
        System.out.println("задача 3");
        for (int numberrr = 0; numberrr <= 17; numberrr = numberrr + 2) {
            System.out.println(numberrr);
        }
        System.out.println("задача 4");
        for (int namber = 10; namber >= -10; namber = namber - 1) {
            System.out.println(namber);
        }
        System.out.println("задача 5");
        for (int vesokosyear = 1904; vesokosyear <= 2096; vesokosyear = vesokosyear + 4) {
            System.out.println(+vesokosyear + "год является високосным");
        }
        System.out.println("задача 6");
        for (int sevennumber = 7; sevennumber <= 98; sevennumber = sevennumber + 7) {
            System.out.println(sevennumber);
        }
        System.out.println("задача 7");
        for (int onenumber = 1; onenumber <= 512; onenumber = onenumber * 2) {
            System.out.println(onenumber);
        }
        System.out.println("задача 8");
        int monthsalary=29000;
        int totalsalary=0;
        int month=1;
        for (month=1;month <=12;month=month+1){
            totalsalary=month*monthsalary;
            System.out.println(+month+ "итого в месяц "+totalsalary);
        }
        System.out.println("задача 9");
        int mounthsalatry =29000;
        int totasalarys=0;
        int mounth=1;
        for(mounth=1;mounth<=12;mounth=mounth+1){
            totasalarys=mounthsalatry/100*mounth;
            System.out.println(+mounth+"месяц"+totasalarys+" накоплений в месяц будет");
        }
        System.out.println("задача 10");
        int numberred = 2;
        int numberxt = 0;
        for (int i = 1; i <= 10; i++) {
            numberxt = numberred * i;
            System.out.println(numberred + " * " + i + " = " + numberxt);
        }
    }
}



