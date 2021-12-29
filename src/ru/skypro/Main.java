package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int clientIos = 0;
        if (clientIos > 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientIos < 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        //2nd
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите упрощенную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите упрощенную версию приложения для Android по ссылке");
        }

        //3rd
        int year = 2030;
        switch (year) {
            case 2016:
                System.out.println("Високосный год");
                break;
            case 2017:
            case 2018:
            case 2019:
            case 2020:
                System.out.println("Обычный год");
                break;
            default:
                System.out.println("На столько календарь не рассчитан");
        }
        //4th Переделал

        int deliveryDistance = 95;
        int deliveryDaysUnder20Km = 1;
        int deliveryDaysOver20Km = deliveryDaysUnder20Km + 1;
        int deliveryDaysOver60Km = deliveryDaysOver20Km + 1;
        if (deliveryDistance == 20) {
            System.out.println("Потребуется дней " +deliveryDaysUnder20Km);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " +deliveryDaysOver20Km);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " +deliveryDaysOver60Km);
        }

        //5th
        int monthNubmer = 13;
        switch (monthNubmer) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
