public class ShowBitsDemo {

    public static void main(String[] args){
        ShowBits b= new ShowBits(8);
        ShowBits i= new ShowBits(16);
        ShowBits li= new ShowBits(64);


        System.out.println("123 в двоичной системе: ");
        b.show(123);

        System.out.println("87987 в двоичной системе: ");
        i.show(87987);

        System.out.println("237658768 в двоичной системе: ");
        li.show(237658768);


        }

    }



