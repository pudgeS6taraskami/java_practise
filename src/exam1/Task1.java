package exam1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Команды:");
        System.out.println("1 - Меню, 2 - Выход");
        System.out.println("Введите 1, что бы открыть меню");
        int gate = sc.nextInt();
        if (gate == 1) {
            System.out.println("Вы вошли в меню");
        }
        System.out.println("Введите день от 1 до 30");
        int a = sc.nextInt();
        if (a <= 30) {

        }
    }
}
