package org.designpatternBuilder;

public class MainApp {
    public static void main(String[] args) {
     Mobile mobile1 = new Mobile.Builder("OnePlus").setColor("red").setRam("2GB").build();
        System.out.println(mobile1);

        Mobile mobile2 = new Mobile.Builder("Samsung").setColor("Black").setRam("5GB").setProcessor("dual-core").build();
        System.out.println(mobile2);
        System.out.println();

        Vehicle car=new Vehicle.VehicleBuilder("1455cc",4).setAirbags(4).build();
        System.out.println(car);
        Vehicle bike=new Vehicle.VehicleBuilder("1500cc",5).setAirbags(14).build();
        System.out.println(bike);


    }
}