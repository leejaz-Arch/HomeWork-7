//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1 и №2");

        int clientOS = 1;
        int clientDeviceYear = 2015;
         switch (clientOS) {
             case 1:
                 System.out.println("Установите версию приложения для Android по ссылке");
                 break;
             case 0:
                 System.out.println("Установите версию приложения для iOS по ссылке");
         }
         if (clientOS == 1 && clientDeviceYear <= 2015) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке");
             } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         }

        System.out.println("Задание №3");

        int year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание №4");

        int deliveryDistance = 95;
        int days = 0;

        if (deliveryDistance <= 0) {
            System.out.println("Расстояние должно быть положительным.");
        } else if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставка невозможна: расстояние свыше 100 км.");
        }

        System.out.println("Потребуется дней: " + days);


        System.out.println("Задание №5");

        int monthNumber = 11;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца: месяц должен быть от 1 до 12.");
            return;
        }

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неизвестный сезон";
                break;
        }

        System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону: " + season);



    }
    }