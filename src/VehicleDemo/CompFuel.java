package VehicleDemo;

public class CompFuel {

    static public void main(String[] args){

        Vehicle bmw=new Vehicle(5,90,8.0);
        Vehicle range_rover=new Vehicle(5,90,9.5);
        Vehicle audi=new Vehicle(5,65,7);
        Vehicle miniven=new Vehicle(7,90,7);
        Vehicle fokus=new Vehicle(5,45,4.2);
        double liters;
        int dist=360;

        System.out.println("для преодоления дистанции "+dist+" км бмв необходимо "+bmw.fuelneeded(dist)+" литров топлива");
        System.out.println("для преодоления дистанции "+dist+" км рендж-ровер необходимо "+range_rover.fuelneeded(dist)+" литров топлива");
        System.out.println("для преодоления дистанции "+dist+" км ауди необходимо "+audi.fuelneeded(dist)+" литров топлива");
        System.out.println("для преодоления дистанции "+dist+" км минивен необходимо "+miniven.fuelneeded(dist)+" литров топлива");
        System.out.println("для преодоления дистанции "+dist+" км фокус необходимо "+fokus.fuelneeded(dist)+" литров топлива");

        System.out.println("А также!");

        System.out.println("Бмв может перевезти на полном баке "+bmw.passengers+" пассажиров на растояние "+bmw.range()+" км");
        System.out.println("Ауди может перевезти на полном баке "+audi.passengers+" пассажиров на растояние "+audi.range()+" км");
        System.out.println("Рендж-ровер может перевезти на полном баке "+range_rover.passengers+" пассажиров на растояние "+range_rover.range()+" км");
        System.out.println("Минивен перевезти на полном баке "+miniven.passengers+" пассажиров на растояние "+miniven.range()+" км");
        System.out.println("Фокус может перевезти на полном баке "+fokus.passengers+" пассажиров на растояние "+fokus.range()+" км");

    }
}
