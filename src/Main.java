import java.time.LocalDate;

public class Main {

    // Метод к заданию 1
    // Создаю метод для определения високосного года
    public static void checkLeapYear(int year) {
        // Объявляю условный оператор на определение високосного года
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }


    // Метод к заданию 2
    // Создаю метод для определения обновления системы
    public static void checkDeviceYear(int clientDeviceYear, int clientOS) {
        // Объявляю условный оператор на определение года для обновления
        boolean isOldDevice = clientDeviceYear < 2015;
        String osMessage = (clientOS == 0) ? "для iOS" : "для Android";
        String versionMessage = isOldDevice ? "облегченную версию" : "обычную версию";

        System.out.println("Установите " + versionMessage + " приложения " + osMessage + " по ссылке.");
    }


    // Метод к заданию 3
    // Создаю метод для определения расстояния
    public static void checkDeliveryDistance(int deliveryDistance) {
        int total = 1;
        // Объявляю условный оператор на определение дистанции
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + total);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            total += 1;
            System.out.println("Потребуется дней: " + total);
        } else if  (deliveryDistance >= 60 && deliveryDistance < 100) {
            total += 2;
            System.out.println("Потребуется дней: " + total);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }


    // Создаю метод для вывода предыдущих методов
    public static void main(String[] args) {

        System.out.println("Задание 1");
        checkLeapYear(2021);

        System.out.println("\nЗадание 2");
        checkDeviceYear(2015, 1);

        System.out.println("\nЗадание 3");
        checkDeliveryDistance(95);
    }
}