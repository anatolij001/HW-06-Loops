public class Main {
    public static void main(String[] args) {
        //---   Задача № 1
        System.out.println("---   Задача № 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();

        //---   Задача № 2
        System.out.println("---   Задача № 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        //---   Задача № 3
        System.out.println("---   Задача № 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        //---   Задача № 4
        System.out.println("---   Задача № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        //---   Задача № 5
        System.out.println("---   Задача № 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println();

        //---   Задача № 6
        System.out.println("---   Задача № 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println();

        //---   Задача № 7
        System.out.println("---   Задача № 7");
        for (int i = 0; i <= 9; i++) {
            System.out.println((int) Math.pow(2, i));
        }
        System.out.println();

        //---   Задача № 8
        System.out.println("---   Задача № 8");
        int moneyAccumPerMonth = 29000, moneyAccumAmount = 0;
        for (int i = 1; i <= 12; i++) {
            moneyAccumAmount += moneyAccumPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moneyAccumAmount + " рублей");
        }
        System.out.println();

        //---   Задача № 9
        System.out.println("---   Задача № 9");
        int moneyAccumPerMonthTsk9 = 29000, moneyAccumAmountTsk9 = 0;
        for (int i = 1; i <= 12; i++) {
            moneyAccumAmountTsk9 += moneyAccumAmountTsk9 * 0.01 + moneyAccumPerMonthTsk9;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moneyAccumAmountTsk9 + " рублей");
        }
        System.out.println();

        //---   Задача № 10
        System.out.println("---   Задача № 10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2*"+i+"="+2*i);
        }
            System.out.println();
    }
}