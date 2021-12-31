package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //1st
        int clientIos = 0;
        if (clientIos > 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            if (clientIos < 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //2nd
        int clientOs = 1;
        int clientDeviceYear = 2015;
        boolean isLiteNeeded = (clientDeviceYear < 2015);
        if (clientOs == 1 && isLiteNeeded) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && isLiteNeeded) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //3rd
        int year = 2015;
        boolean isLeapYear = ((year % 4 == 0 || year % 400 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            System.out.println("Год високосный ");
        } else {
            System.out.println("Год не високосный");
        }

        //4th
        int deliveryDistance = 61;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Понадобится дней " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Понадобится дней " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Понадобится дней " + (deliveryDays + 2));
        }

        //5th
        int monthNubmer = 12;
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
