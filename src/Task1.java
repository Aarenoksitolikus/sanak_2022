import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("ваше число: " + a);

        // есть вводимое с клавиатуры число - номер дня в году
        // Надо вывести название месяца, который будет в этот день

        // 5 -> Январь
        // 110 -> Апрель
        // -5 -> вывести "Некорректная дата"
        // 700 -> вывести "Некорректное число"
        // 700 -> вывести Декабрь

        // int
        // (5 / 2) = 2
        // (5 % 2) = 5
    }
}
