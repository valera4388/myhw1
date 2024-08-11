public class Main {
    public static void main(String[] args) {
        int price = 69842; //стоимость билета
        int priceBonus = 20; //сумма для получения 1 мили

        int bonus = price / priceBonus;
        System.out.println("Количество начисленных миль: " + bonus);

    }
}