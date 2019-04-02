public class Vehicle {
    int passengers;
    int fuelcap;
    double liter_100;
    int distM;

    Vehicle(int p,int f,double L){
        passengers=p;
        fuelcap=f;
        liter_100=L;
    }

    double range(){
        return fuelcap/liter_100*100;
    }

    double fuelneeded(int km){
        return (double)liter_100*km/100;
    }

    double maslorange(){
        return
    }


}
