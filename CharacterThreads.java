class PrintAtoE extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(c);
        }
    }
}

class PrintFtoJ extends Thread {
    @Override
    public void run() {
        for (char c = 'F'; c <= 'J'; c++) {
            System.out.println(c);
        }
    }
}

public class CharacterThreads {
    public static void main(String[] args) {
        PrintAtoE thread1 = new PrintAtoE();
        PrintFtoJ thread2 = new PrintFtoJ();

        thread1.start();
        thread2.start();
    }
}