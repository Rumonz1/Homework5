public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        //Задание 2
        int clientDeviceYear = 2015;
        byte operationSystem = 1;
        if (clientDeviceYear >= 2015&& clientDeviceYear <= 2022 && operationSystem == 1 ) {
            System.out.println("Установите приложение на ваше Android устройство!");
        } else if (clientDeviceYear >= 2015&& clientDeviceYear <= 2022 && operationSystem == 0) {
            System.out.println("Установите приложение на ваше iOS устройство!");
        }
        if (clientDeviceYear < 2015 && operationSystem == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientDeviceYear < 2015 && operationSystem == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        //Задание 3
        int year = 2021;
        if (year % 4 == 0 || year % 400==0){
            System.out.println(+year+" год является високосным");
        }else if (year % 100 !=0){
            System.out.println(+year + " год не является високосным");
        }
        //Задание 4
        int deliveryDistance = 22;
        int deliveryDay;
        if (deliveryDistance >=0 && deliveryDistance <=20){deliveryDay = 1;
            System.out.println("Потребуется дней: " +deliveryDay);
        } else if (deliveryDistance >=20 &&deliveryDistance <=60) {
            deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <=100) {deliveryDay = 3;
            System.out.println("Потребуется дней: " +deliveryDay);
        } else {
            System.out.println("Дальше 100км доставка невозможна");}
        //Задание 5
        byte monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}