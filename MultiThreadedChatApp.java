class Chat {
    private boolean flag = false;

    public synchronized void sender(String message) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + message);
        flag = true;
        notify();
    }

    public synchronized void receiver(String reply) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + reply);
        flag = false;
        notify();
    }
}

class SenderThread extends Thread {
    private Chat chat;
    private String[] messages = { "Hello", "How are you?", "What's up?", "Goodbye" };

    public SenderThread(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String message : messages) {
            chat.sender(message);
        }
    }
}

class ReceiverThread extends Thread {
    private Chat chat;
    private String[] replies = { "Hi", "I'm fine, thanks!", "Not much", "Bye" };

    public ReceiverThread(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String reply : replies) {
            chat.receiver(reply);
        }
    }
}

public class MultiThreadedChatApp {
    public static void main(String[] args) {
        Chat chat = new Chat();
        SenderThread sender = new SenderThread(chat);
        ReceiverThread receiver = new ReceiverThread(chat);

        sender.start();
        receiver.start();
    }
}