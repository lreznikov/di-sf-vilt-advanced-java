package com.di.sf.strategy;

public class SumAccumulator implements AccumulatorStrategy { // ConcreteStrategyB
    @Override
    public Integer process(Integer a, Integer b) {
        return a + b;
    }
}
