import java.time.LocalDate;

public class Main {

    public static boolean leapYearYesNo(int year){
        return ((year % 4 == 0 && year !=100) || year % 400==0);
    }
    private static void leapYearSay(int year) {
        System.out.println("Task 1");
        if (leapYearYesNo(year)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    private static void mobileApp(int year, int clientOS){
        System.out.println("Task 2");
        if (clientOS == 0){
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (year<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void sayDeliveryDay(int deliveryDistance){
        System.out.println("Задача 3");
        int deliveryDay = deliveryDistance(deliveryDistance);
        if(deliveryDay<0){
            System.out.println("Доставки нет");
        } else if(deliveryDay==1){
            System.out.println("Доставка: "+deliveryDay+ " день." );
        } else {
            System.out.println("Доставка: "+deliveryDay+ " дня." );
        }
    }

    public static int deliveryDistance (int distance){
        if (distance<20){
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int yearToDay = LocalDate.now().getYear(); //Получаем текущий год
        leapYearSay(yearToDay); // Модуль високосного года.
        int num = 0;
        mobileApp(yearToDay,num); // Модуль установки приложения.
        int distance = 10;
        sayDeliveryDay(distance);
    }
}