public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
    System.out.println("Задание 1");
    int clientOS = 0;
    if (clientOS == 0){
    System.out.println("Установите приложение для IOS.");
    } else {
    System.out.println("Установите приложения для Android.");}
    }

    private static void task2() {
    System.out.println("Задание 2");
    int clientOS = 0;
    int clientDeviceYear = 2014;
    if (clientOS == 0) {
    if (clientDeviceYear < 2015) {
    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
    } else {
    System.out.println("Установите версию приложения для iOS по ссылке.");}
    } else if (clientDeviceYear < 2015) {
    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    } else {
    System.out.println("Установите версию приложения для Android по ссылке.");}
    }

    private static void task3() {
    System.out.println("Задание 3");
    int year = 2023;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    System.out.println(year + " является висакосным годом.");
    }else{
    System.out.println(year + " не является висакосным годом.");}
    }

    private static void task4 () {
    System.out.println("Задание 4");
    int deliveryDistance = 101;
    int deliveryDays = 1;
    if(deliveryDistance>20){
    deliveryDays++;}
    if(deliveryDistance>60){
    deliveryDays++;}
    System.out.println("Потребуется дней: " + deliveryDays+" доставки.");
    if(deliveryDistance>100){
    System.out.println("Доставка не осуществляется.");}
    }


    private static void task5 () {
    System.out.println("задание 5");
    int monthNumber = 13;
    switch(monthNumber){
    case 12:
    case 1:
    case 2:
    System.out.println("Зима.");
    break;
    case 3:
    case 4:
    case 5:
    System.out.println("Весна.");
    break;
    case 6:
    case 7:
    case 8:
    System.out.println("Лето.");
    break;
    case 9:
    case 10:
    case 11:
    System.out.println("Осень.");
    default:
    System.out.println(monthNumber + " месяца не существет");}
    }
}
