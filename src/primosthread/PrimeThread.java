package primosthread;

public class PrimeThread {

    public static void main(String[] args) {
        // Print the first 1000 prime numbers.
        int startValue = 0;
        int endValue = 100;
        while (endValue <= 1000) {
            Prime primeNumber = new Prime(startValue, endValue);
            Thread myThread = new Thread(primeNumber); // Asynchronous thread. That's why the numbers are not in order.
            myThread.start();
            startValue = startValue + 100;
            endValue = endValue + 100;
        }
    }

}
