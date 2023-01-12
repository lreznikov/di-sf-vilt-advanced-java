package com.di.sf.decorator;

public class NutsSundae extends SundaeDecorator { // ConcreteDecoratorC
    public NutsSundae(Sundae decorated) {
        super(decorated);
    }

    @Override
    public String describeSundae() {
        return getDecorated().describeSundae() + " with NUTS";
    }
}
