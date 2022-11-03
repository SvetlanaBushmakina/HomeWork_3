public class Grechka_2 {
    public static void main(String[] args) {
        int month = 9;
        int monthGrechka = 6;
        int payForMonth;
        int allGrechka = monthGrechka * month;
        int allPay = allGrechka * 100;
        for (; allGrechka <= allGrechka; ) {
            allGrechka = allGrechka - monthGrechka;
            if (allGrechka < 0) {
                break;
            }
            payForMonth = allGrechka * 100;
            allPay += payForMonth;
        }
        System.out.println(allPay);
    }
}

