package org.factoryDesignpattern;

public class FactoryMain {
    public static void main(String[] args) {

        LaptopFactory laptopFactory=new LaptopFactory();
        Laptop laptop= laptopFactory.getNewLaptop("Ordered");
        laptop.laptopSpecial();
    }
}
