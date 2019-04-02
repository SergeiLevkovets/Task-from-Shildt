class Queue {

    private char[] q; //Массив для хранения очереди
    private int putloc, getloc;  //индексы для вставки и извлечения очереди

    Queue (int size){
        q=new char[size+1];
        putloc=getloc=0;
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
public class QDemo {
    public static void main(String[] args){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
     //Поместить буквеные символы в очередь bigQ
        for (i=0;i<26;i++){
            bigQ.put((char)('A'+i));
        }
        // Извлечь буквенные символы из очереди bigQ и отобразить


        for (i=0;i<26;i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
            System.out.println("\n");
        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (i=0;i<5;i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        //Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for (i=0;i<5;i++){
            ch=smallQ.get();
            if (ch!=(char)0){
                System.out.print(ch);
            }
        }


    }


}
