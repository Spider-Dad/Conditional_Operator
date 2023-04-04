// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int balanceStart = 100; // Стартовый баланс
        int payment = 1050; // Текущий платеж
        int paymentCashback = 1000; // Минимальный платеж для начисления кэшбэка
        int cashbackStep = 100; // Количество рублей за 1 бонусный рубль
        int balanceCurrent;  // Текущий баланс
        int cashback; // Текущий кэшбэк

        if (payment >= paymentCashback) {
            cashback = (payment - payment % cashbackStep) / cashbackStep;
        } else {
            cashback = 0;
        }

        balanceCurrent = balanceStart + payment + cashback;

        System.out.println("Текущий баланс: " + balanceCurrent + " рублей");
        System.out.println("В том числе кэшбэк: " + cashback + " рублей");
    }
}