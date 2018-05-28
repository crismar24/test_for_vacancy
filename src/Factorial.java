public class Factorial {
    public Factorial() {
    }

    public static void main(String[] args) {
        long n = 0;

//        args = new String[1];
//        args[0] = "4.2";
//        System.out.println(args.length);

        try {
            n = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        long fact = calculate(n);
        System.out.println(fact);
    }

    private static long calculate(long n){
        if (n < 0) {
           throw new RuntimeException("not positive number");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
             fact *= i;
        }
        return fact;
    }
}
