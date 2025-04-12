
class EvenNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}


class OddNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        EvenNumberThread evenThread = new EvenNumberThread();
        OddNumberThread oddThread = new OddNumberThread();
        
        
        evenThread.start();
        oddThread.start();
    }
}