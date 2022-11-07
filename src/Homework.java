public class Homework {
    public static void main(String[] args) {
        //Задание 1
        int asterixPotionСookTime = 3;
        int abelixPotionCookTime = (asterixPotionСookTime / 2);
        boolean potionCook = (asterixPotionСookTime + abelixPotionCookTime) > 5;
        System.out.println(potionCook);

        //Задание 2
        long countOfPeopleInChina = 1_411_788_724L;
        int countOfCountriesInWorld = 197;
        long possibleCountOfPeopleInWorld = (countOfPeopleInChina *countOfCountriesInWorld);
        System.out.println(possibleCountOfPeopleInWorld);

        //Задание 3
        long felixLifeTimeInSeconds = 3_011_456_567L;
        long secondsInYear = (3600 * 24) * 365;
        long felixYears = (felixLifeTimeInSeconds / secondsInYear);
        System.out.println(felixYears);
    }
}
