public class MyThirdLesson {
    public static void main(String[] args) {
// целые числа
        // дробные числа
        float firstNumber; // 4 байта
        double SecondNumber; // 8 байт

        double number = 1; //5.0
                int n = 1;
        System.out.println(number / 2);
        System.out.println(n / 2);

        float f = 1.0F;
        System.out.println(1 - 0.9F);

        //Вася получается зарплату в 5.6 евро в час. Он работает 12 часов в день, у него нет выходных, кроме 31 декабря.
        //Он работает 364 дня в году
        //Сколько часов отработает Вася за год и сколько он заработает денег.

        double SalaryPerHour = 5.6;
        int WorkingDays = 364;
        int WorkingHoursInDay = 12;
        double WorkingHoursInYear = WorkingDays * SalaryPerHour;
        double SalaryPerYear = WorkingDays + WorkingHoursInYear * SalaryPerHour;
        System.out.println(SalaryPerYear);
        System.out.println(WorkingHoursInYear);

        //символ
        char symbol = 'a';




    }
}


