package com.di.sf.decorator;

public abstract class SundaeDecorator implements Sundae { // Decorator
    private Sundae decorated;

    public SundaeDecorator(Sundae decorated) {
        this.decorated = decorated;
    }

    public Sundae getDecorated() {
        return decorated;
    }
}
