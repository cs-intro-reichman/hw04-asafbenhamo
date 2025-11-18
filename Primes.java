public class Primes { 

        public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int count = 0;
        if (a < 2) System.out.println(0);
        System.out.println("Prime numbers up to " + a + ":");
        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        double p= (double) count / a * 100.0;
        System.out.println("There are " + count + " primes between 2 and " +a+ " ("+p+"% are primes)");
    }
}
}
