public class SimpleNumber {
    public static void main(String[] args) {
        boolean c = true;
        int number = 5;
        int a;

        for (int i = 2; i < number; i++) {
            a = number % i;
//            System.out.println(a);
            if (a == 0) {
                c = false;
                break;
            }
        }
        if (c && number != 1) {
            System.out.println("Простое");
        } else if (number == 1) {
            System.out.println("Ни является ни простым ни составным");
        } else {
            System.out.println("Составное");
        }

    }
}