public class GeometricProgression {
    public static void main(String[] args) {

        int sum = 1;
        int n = 100;
        for (int b1 = 1; b1 <= n; ) {
            System.out.println(b1);
            b1 *= 2;
            if (b1 > n) {
                break;
            }
            sum += b1;
        }

        System.out.println("Сумма = " + sum);
    }
}
