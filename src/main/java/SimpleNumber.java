public class SimpleNumber {
    public static void main(String[] args) {
        boolean c = true;
        int chislo = 5;
        int a;

        for (int i = 2; i < chislo; i++) {
            a = chislo % i;
//            System.out.println(a);
            if (a == 0) {
                c = false;
                break;
            }
        }
        if (c && chislo != 1) {
            System.out.println("Простое");
        } else if (chislo == 1) {
            System.out.println("Ни является ни простым ни составным");
        } else {
            System.out.println("Составное");
        }

    }
}