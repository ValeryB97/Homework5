public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения  для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        // Задпние 3
        int year = 1904;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високостный");
        } else {
            System.out.println("Год " + year + " не является високостным");
        }
        // Задание 4
        int deliveryDistance = 54;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуеться один день для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуеться два дня для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуеться три дня для доставки");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        // Задание 5
        int monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весений");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенний");
                break;
            default:
                System.out.println("Такого месяц нет");
        }
    }
}
