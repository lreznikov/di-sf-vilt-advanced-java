package com.di.sf.strategy;

import java.util.List;

public class NumberAccumulator { // StrategyClient
    private AccumulatorStrategy strategy;

    public void setStrategy(AccumulatorStrategy strategy) {
        this.strategy = strategy;
    }

    public Integer accumulate(List<Integer> arguments) { // performOperation
        Integer ret = 0;

        for (int ix = 1; ix < arguments.size(); ix++) {
            ret += strategy.process(arguments.get(ix - 1), arguments.get(ix)); // strategy.operate()
        }

        return ret;
    }
}
