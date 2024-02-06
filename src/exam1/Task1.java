package exam1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        final double EURO_RATE = 0.0101;
        final double DOLLAR_RATE = 0.0101;
        final double YUAN_RATE = 0.08;
        Scanner scanner = new Scanner(System.in);
        final double[] expenses = new double[31];

        while (true) {
            System.out.println("Меню:");
            System.out.println("1 - Ввести расходы за определенный день");
            System.out.println("2 - Траты за месяц");
            System.out.println("3 - Самая большая сумма расхода за месяц");
            System.out.println("4 - Конвертер валюты");
            System.out.println("0 - Выход");
            System.out.print("Выберите пункт меню: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Введите день (от 1 до 31): ");
                int day = scanner.nextInt();

                if (day < 1 || day > 31) {
                    System.out.println("Некорректный день. Попробуйте еще раз.");
                    continue;
                }

                day--;

                if (expenses[day] > 0) {
                    System.out.println("За этот день уже указана сумма трат: " + expenses[day] + " руб.");
                    System.out.print("Хотите перезаписать? (1 - Да, 0 - Нет): ");
                    int overwriteChoice = scanner.nextInt();
                    if (overwriteChoice == 0) {
                        continue;
                    }
                }

                System.out.print("Введите сумму трат за этот день: ");
                int amount = scanner.nextInt();
                expenses[day] = amount;

                System.out.println("Сумма трат за " + (day + 1) + " день установлена на " + amount + " руб.");
                System.out.print("Желаете ввести траты за другой день? (1 - Да, 0 - Нет): ");
                int continueChoice = scanner.nextInt();
                if (continueChoice == 0) {

                }
            } else if (choice == 2) {
                System.out.println("Траты за месяц:");
                for (int i = 0; i < expenses.length; i++) {
                    System.out.println((i + 1) + " день – " + expenses[i] + " руб");
                }

            } else if (choice == 3) {
                double maxExpense = 0;
                int  maxExpenseDay = 0;

                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > maxExpense) {
                        maxExpense = expenses[i];
                        maxExpenseDay = i + 1;
                    }
                }

                System.out.println("Самая большая сумма расхода за месяц: " +  maxExpense + " " + "руб" + " " + maxExpenseDay + " " + "числа");

            } else if (choice == 4) {
                System.out.println("Конвертер валюты");
                System.out.println("Траты за месяц в EUR:");
                for (int i = 0; i < expenses.length; i++) {
                    expenses[i] = expenses[i] * EURO_RATE;
                    System.out.println("День - " + (i + 1) + " - " + expenses[i]);
                }

                System.out.println("Траты за месяц в USD:");
                for (int a = 0; a < expenses.length; a++) {
                    expenses[a] = expenses[a] * DOLLAR_RATE;
                    System.out.println("День - " + (a + 1) + " - " + expenses[a]);
                }

                System.out.println("Траты за месяц в CNY:");
                for (int b = 0; b < expenses.length; b++) {
                    expenses[b] = expenses[b] * YUAN_RATE;
                    System.out.println("День - " + (b + 1) + " - " + expenses[b]);
                }

            } else if (choice == 0) {
                System.out.println("Вы успешно вышли!");
                System.exit(0);
            } else {
                System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
