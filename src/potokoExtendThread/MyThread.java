package potokoExtendThread;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);

            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " прерван");
        }
        System.out.println(getName() + " завершон");
    }
}
