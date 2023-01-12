package com.di.sf.decorator;

import java.util.Objects;

public class WhipcreamSundae extends SundaeDecorator { // ConcreteDecoratorA
    public WhipcreamSundae() {
        super(null);
    }

    public WhipcreamSundae(Sundae decorated) {
        super(decorated);
    }

    @Override
    public String describeSundae() {
        return Objects.isNull(getDecorated()) ? "I am a delicious WHIPCREAM" : getDecorated().describeSundae() + " with WHIPCREAM";
    }
}
