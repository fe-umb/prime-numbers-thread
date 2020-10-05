package primosthread;

public class Prime implements Runnable {

    private int startValue;
    private int endValue;

    public Prime(int valorInicial, int valorFinal) {
        this.startValue = valorInicial;
        this.endValue = valorFinal;
    }

    @Override
    public void run() {
        for (int i = startValue; i <= endValue; i++) {
            if (i != 0 && i != 1) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static synchronized boolean isPrime(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
