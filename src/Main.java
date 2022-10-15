import java.time.LocalDate;

public class Main {

    private static void LeapYear(int year) {
        if (year <= 0) {
            System.out.println("Некорректное значение года");
            return;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void ClientOSAndDeviceYear(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear <= 0) {
            System.out.println("Некорректное значение года");
            return;
        }
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Не удается идентифицировать операционную систему");
            return;
        }

        if (clientDeviceYear < currentYear) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear >= currentYear) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }

    private static int DeliveryTime(int distance) {
        if (distance < 0) {
            System.out.println("Вы указали расстояние меньше нуля, укажите значение больше нуля");
            return 0;
        }
        int time = 1;
        if (distance <= 20) {
            time = 1;
        } else {
            int a = distance - 20;
            if (a % 40 == 0) {
                time = time + a / 40;
            } else {
                time = time + a / 40 + 1;
            }
        }
        return time;
    }


    public static void main(String[] args) {

        //Задание 1

        int year = 2024;
        LeapYear(year);

        //Задание 2

        int clientDeviceYear = 2019;
        int clientOS = 1;
        ClientOSAndDeviceYear(clientOS, clientDeviceYear);

        //Задание 3

        int distance = 155;
        System.out.println("Потребуется дней: " + DeliveryTime(distance));
    }
}
