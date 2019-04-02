package Bubble;

public class Bubble {

    public static void main (String[] args){

        int [] nums={99,-10,100123,18,-978,5623,463,-9,287,49,0,-155,-345,11,89};
        int a, b, t;
        int size;
        size=nums.length;
// Отобразить исходный массив
        System.out.print("Исходный масив: ");
        for (int i=0; i<size;i++){
            System.out.print(" "+nums[i]);
        }
        System.out.println();
// Реализовать алгоритм пузырьковой сортировки
        for (a=1;a<size;a++){
            for (b=size-1;b>=a;b--){
                if (nums[b-1]>nums[b]){
                    t=nums[b-1];
                    nums[b-1]=nums[b];
                    nums[b]=t;
                }
            }
        }
// Отобразить отсортированый массив
        System.out.print("Отсортированый масив: ");
        for (int i=0;i<size;i++){
            System.out.print(" "+nums[i]);
        }
        System.out.println();
    }


}
