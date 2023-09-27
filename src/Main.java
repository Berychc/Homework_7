public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }
    public static void task1() {
        int initialAmount = 0;
        int monthlySaving = 15_000;
        int month = 0;
        while (initialAmount < 2_459_000) {
            initialAmount += monthlySaving;
            month++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей", month, initialAmount);
    }
    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }
    public static void task3() {
        int population = 12_000_000;
        double birthRate = 17;
        double deathRate = 8;
        int timeYears = 10;
        for (int year = 1; year <= timeYears; year++) {
            population = (int) (population * (1 + (birthRate - deathRate) / 1000));
            System.out.printf("Год %d, численность населения составляет %d\n", year, population);
        }
    }
    public static void task4() {
        double largeAccumulations = 15_000;
        int month = 0;
        while (largeAccumulations < 12_000_000) {
            month++;
            double percent = largeAccumulations * 0.07;
            largeAccumulations += percent;
            System.out.printf("Месяц %d : %.3f\n", month, largeAccumulations);
        }
    }
    public static void task5() {
        double savings = 1000;
        double interestRate = 0.05;
        for (int month = 1; month <= 36; month++) {
            savings += savings * interestRate;
            if (month % 6 == 0) {
                System.out.printf("Накопления после %d месяца: %.2f%n", month, savings);
            }
        }
    }
    public static void task6() {
        double initialAmount = 15000;
        double interestRate = 0.07;
        for (int year = 1; year <= 9; year++) {
            for (int halfYear = 1; halfYear <= 2; halfYear++) {
                double halfYearAmount = initialAmount * Math.pow(1 + interestRate, year * 2 - halfYear);
                System.out.printf("Сумма накоплений за %d-й год, %d-е полугодие: %.3f рублей\n", year, halfYear, halfYearAmount);
            }
        }
    }
    public static void task7() {
        int firstFriday = 6;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);
        }
    }
    public static void task8() {
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 79) == 0) {
                System.out.println(year);
            }
        }
    }
}
