public class ShowBits {
    int numbits;


    ShowBits (int n){

        numbits=n;
    }

    void show (long val){
        long mask=1;
        mask<<=numbits-1;

        int spaser = 0;
        for (;mask!=0; mask>>>=1){
            if ((val & mask)!=0) System.out.print("1");
            else System.out.print("0");
            spaser++;
            if ((spaser%4)==0){
                System.out.print(" ");
                spaser=0;
            }
        }
        System.out.println();
    }



}
