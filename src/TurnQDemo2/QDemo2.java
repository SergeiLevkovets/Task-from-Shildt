class Queue {

    private char q[]; //Массив для хранения очереди
    private int putloc, getloc;  //индексы для вставки и извлечения очереди

    Queue (int size){
        q=new char[size+1];
        putloc=getloc=0;
    }


    Queue (Queue ob){
        putloc=ob.putloc;
        getloc=ob.getloc;
        q=new char[ob.q.length];

        for (int i=getloc+1; i<=putloc; i++){
            q[i]=ob.q[i];
        }
    }


    Queue (char a[]){
        putloc=0;
        getloc=0;
        q=new char[a.length+1];
        for (int i=0; i<a.length; i++){
            put(a[i]);
        }
    }


    //Поместить символ в очередь
    void put (char ch){
        if (putloc==q.length-1){
            System.out.println(" - очередь заполнена");
            return;
        }
        putloc++;
        q[putloc]=ch;
    }
    //Извлечь символ из очереди
    char get(){
        if (getloc==putloc){
            System.out.println(" - очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}

// демонстрация использования класса Queue
public class QDemo2 {

    public static void main(String[] args){
        // Пустая очередь для 10 элементов
        Queue q1 = new Queue(10);

        char[] name={'T','o','m'};
        // Создать очередь на основании массива
        Queue q2 = new Queue(name);

        char ch;
        int i;


     //Поместить буквеные символы в очередь й1
        for (i=0;i<10;i++){
            q1.put((char)('A'+i));
        }

        //создать одну очередь на основании другой
        Queue q3=new Queue(q1);

        // Показать очереди

        System.out.print("Содержимое q1: ");
        for (i=0;i<10;i++) {
            ch = q1.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
            System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i=0;i<3;i++) {
            ch = q2.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i=0;i<10;i++) {
            ch = q3.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println("\n");




    }


}
