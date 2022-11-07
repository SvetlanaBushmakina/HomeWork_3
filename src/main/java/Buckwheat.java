public class Buckwheat {
    public static void main(String[] args) {
        int allBuckwheat = 100;
        int monthBuckwheat = 6;
        int payForMonth;
        int allPay = allBuckwheat * 100;
        for (allBuckwheat = 100; allBuckwheat <= 100; ) {
            allBuckwheat = allBuckwheat - monthBuckwheat;
            if (allBuckwheat < 0) {
                break;
            }
            payForMonth = allBuckwheat * 100;
            allPay += payForMonth;

        }
        System.out.println("За хранение гречки Василий заплатит: " + allPay);
    }
}
