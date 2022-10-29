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

    }
}