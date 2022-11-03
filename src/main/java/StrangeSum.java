public class StrangeSum {
    public static void main(String[] args) {
        int a;
        int b;

        for (a = 1, b = 2; b <= 100; ) {
            a -= b;
            if (b == 100) {
                break;
            }
            b++;
            a += b;
            b++;
        }
        System.out.println(a);
    }
}
