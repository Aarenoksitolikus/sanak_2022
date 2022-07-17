import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // тип переменной строка
        String newVariable = "New string";
        // тип переменной целочисленное число
        int newInt = 5;
        // тип переменной символ
        char newChar = '?';
        // тип переменной число с точкой
        double newDouble = 3.5;
        //тип переменное БААААЛЬШОЕ число
        long newLong = 999999999999999999l;
        // тип переменной "а не врешь ли ты мне?"
        boolean newBoolean = true;
        boolean isPrime = 7 % 2 == 0;
        boolean isntPrime = 7 % 2 != 0;

        //логический блок
        if (5 > 2) {
            System.out.println("DA.");
        } else {
            System.out.println("NET.");
        }

        // задание
        Random random = new Random();
        int amountOfDays = random.nextInt(20);
        // у вас есть сегодняшняя дата и количество дней
        // вывести "да" если день будет в этом месяце и "нет" если нет

        int age = random.nextInt(1, 20);
//        if (1 условие) {
//            if (2 условие) {
//
//            }
//        }
//
//        if (1 условие && 2 условие) {
//
//        }
    }
}
