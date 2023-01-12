package com.di.sf.decorator;

public class VanillaIceCream implements Sundae { // ConcreteComponent2
    @Override
    public String describeSundae() {
        return "I am a delicious VANILLA ice cream";
    }
}
