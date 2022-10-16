package org.singletondesignpattern;

public class TestSingleton {

    static TestSingleton Object=new TestSingleton();

    private TestSingleton(){

    }
    public static TestSingleton getInstance(){
      return  Object ;
    }
}
