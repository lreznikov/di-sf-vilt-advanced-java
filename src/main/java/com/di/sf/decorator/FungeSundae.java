package com.di.sf.decorator;

public class FungeSundae extends SundaeDecorator { // ConcreteDecoratorB
    public FungeSundae(Sundae decorated) {
        super(decorated);
    }

    @Override
    public String describeSundae() {
        return getDecorated().describeSundae() + " with FUNGE";
    }
}
