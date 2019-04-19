package potokoExtendThread;

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread thread1 = new MyThread("Child #1");
        MyThread thread2 = new MyThread("Child #2");
        MyThread thread3 = new MyThread("Child #3");

        for (int i = 0; i < 50; i++){
            System.out.print(" $ ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exs){
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
