package org.factoryDesignpattern;

public class LaptopFactory {
    public Laptop getNewLaptop(String str){
        if(str.equals("Secured"))
            return new AppleLaptop();
        else if(str.equals("Ordered"))
            return new DellLaptop();
        else
            return new HpLaptop();

    }
}
