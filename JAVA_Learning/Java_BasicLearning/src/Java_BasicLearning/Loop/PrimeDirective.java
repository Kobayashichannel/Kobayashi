package Java_BasicLearning.Loop;

// Import statement:
import java.util.ArrayList;
class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        // method body goes here
        for (int i = 2; i < number; i++) {
            // check divisibility here
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {

        // method body goes here
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(6));
        System.out.println(pd.onlyPrimes(numbers));
    }

}