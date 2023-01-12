package com.di.sf.strategy;

public class ProductionAccumulator implements AccumulatorStrategy { // ConcreteStrategyA
    @Override
    public Integer process(Integer a, Integer b) {
        return a * b;
    }
}
