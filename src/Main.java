public class Main {
    public static void checkYear(int year) {
        if ((year > 1584) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год - високосный год ");
        } else {
            System.out.println(year + " год - невисокосный год ");

        }
    }
    public static void checkMobile(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("становите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void checkDistance(int range) {
        if (range <= 20) {
            System.out.println("Одни сутки");
        } else if (range > 20 && range <= 60) {
            System.out.println("Двое суток");
        } else if (range > 60 && range <= 100) {
            System.out.println("Трое суток");
        } else {
            System.out.println("Доставки нет");
        }

    }
    public static void main(String[] args) {

    }
}