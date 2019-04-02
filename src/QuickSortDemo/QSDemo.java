class Quicksort{

    //Организовать вызов фактического метода быстрой сортировки
    static void qsort(char items[]){

        qs (items, 0, items.length-1);
    }
    //Рнеурсивная версия метода быстрой сортировки
    private static void qs(char items[], int left, int right){
        int i, j;
        char x, y;

        i=left; j=right;
        x=items[(left+right)/2];

        do {

            while ((items[i]<x) && (i<right)) i++;
            while ((x<items[j]) && (j>left)) j--;

            if (i<=j){
                y=items[i];
                items[i]=items[j];
                items[j]=y;
                i++; j--;
            }
         //   for (int k=0;k<items.length;k++) {
         //       System.out.print(items[k]);}
         //   System.out.println();

        }while (i<=j);

        if (left<j) qs(items, left, j);
        if (i<right) qs(items, i, right);
    }

}

public class QSDemo {

    public static void main(String[] args){
        char a[]={'g','f','e','d','c','b','a'};
        int i;

        System.out.print("Исходный массив: ");
        for (i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        //Отсортировать массив
        Quicksort.qsort(a);

        System.out.print("Отсортированый массив: ");
        for (i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }


    }


}
