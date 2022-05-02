public class Main {
    public static void main(String[] args) {
        int primaryBalance = 100;
        int sumOfFirstRefill = 100;
        int sumOfSecondRefill = 1100;
        int bonus = sumOfSecondRefill / 100;

        System.out.println("Итоговый счет2");
        System.out.println((primaryBalance + sumOfSecondRefill + bonus) + " руб ");


        System.out.println("Количество бонусных рублей2");
        System.out.println((sumOfSecondRefill / 100) + " руб ");
    }


}
