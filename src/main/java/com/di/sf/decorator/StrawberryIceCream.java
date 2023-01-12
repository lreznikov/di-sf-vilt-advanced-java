package com.di.sf.decorator;

public class StrawberryIceCream implements Sundae { // ConcreteComponent1
    @Override
    public String describeSundae() {
        return "I am a delicious STRAWBERRY ice cream";
    }
}
