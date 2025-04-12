class TableOfTwoThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
}

class TableOfThreeRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}

public class MultiplicationTables {
    public static void main(String[] args) {
        TableOfTwoThread tableOfTwoThread = new TableOfTwoThread();
        tableOfTwoThread.start();

        Thread tableOfThreeThread = new Thread(new TableOfThreeRunnable());
        tableOfThreeThread.start();
    }
}