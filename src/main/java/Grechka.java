public class Grechka {
    public static void main(String[] args) {
        int allGrechka = 100;
        int monthGrechka = 6;
        int payForMonth;
        int allPay = allGrechka * 100;
        for (allGrechka = 100; allGrechka <= 100; ) {
            allGrechka = allGrechka - monthGrechka;
            if (allGrechka < 0) {
                break;
            }
            payForMonth = allGrechka * 100;
            allPay += payForMonth;

        }
        System.out.println("За хранение гречки Василий заплатит: " + allPay);
    }
}
