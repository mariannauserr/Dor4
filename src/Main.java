public class Main {
    public static void main(String[] args) {
        int primaryBalance = 100;
        int sumOfSecondRefill = 1100;
        int bonus = sumOfSecondRefill / 100;
        if (sumOfSecondRefill > 1000) {
            bonus = sumOfSecondRefill / 100;

        } else {
            bonus =0;
        }


        System.out.println("Количество бонусных рублей2");
        System.out.println((sumOfSecondRefill / 100) + " руб ");
        System.out.println("Итоговая сумма");
        System.out.println((primaryBalance + sumOfSecondRefill) + " руб ");

    }


}
