import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // вводите с клавиатуры время
        // программа должна вам выдать,
        // где сэлкеш должен быть сейчас
        // например, если вы ввели время 13:05
        // то ответ должен быть "на обеде"
        // 8:00 - подъем
        // 8:30 - зарядка
        // 9:00 - завтрак
        // 9:40 - туры таяк
        // 10:00 - урок
        // 13:00 - обед
        // 14:00 - мастер класс
        // 16:00 - полдник
        // 16:30 - отрядное время
        // 18:30 - ужин
        // 20:00 - вечернее мероприятие
        // 23:00 - отбой
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        System.out.println("time: " + hours + ":" + minutes);
    }
}
