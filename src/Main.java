import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myFriend;
        final int NUM = 19;
        String word = "friend";

        myFriend = "Islam";

        System.out.println(myFriend);
        System.out.println(NUM);
        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.next();
        System.out.println("Привет," + name);
    }
}