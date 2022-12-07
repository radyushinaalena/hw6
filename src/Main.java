public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        char clientOS = 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        char clientOS = 0;
        if (clientDeviceYear < 2015){
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }
        else {
            switch (clientOS){
                case 0:
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2008;
        if (year%400 == 0) {
            System.out.println(year + " год является високосным");
        }
            else if (year%100 == 0) {
            System.out.println(year + " год не является високосным");
        }
        else if (year%4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryArea1 = 1;
        int deliveryArea2 = deliveryArea1 + 1;
        int deliveryArea3 = deliveryArea2 + 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryArea1);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryArea2);
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliveryArea3);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("месяца номер "+monthNumber+" не существует");
        }
    }
}