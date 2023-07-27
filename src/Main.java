public class Main {
    public static void main(String[] args) {
        int x = 250; //Исходный счет
        int y = 1700; //Сумма пополнения
        int z = y / 100; //Количество бонусов
        int i = y + x; //Итоговый счет
        if (y > 1000) {
            System.out.println("Бонусы =" + z);
        }
        System.out.println("Исходный счет =" + x);
        System.out.println("Сумма пополнения =" + y);
        System.out.println("Итоговый счет =" + i);
    }
}