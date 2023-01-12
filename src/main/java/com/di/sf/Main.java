package com.di.sf;

import com.di.sf.command.Action;
import com.di.sf.command.ConsoleTarget;
import com.di.sf.command.DialogTarget;
import com.di.sf.command.QueryTimeAction;
import com.di.sf.decorator.*;
import com.di.sf.factory.abstrct.api.*;
import com.di.sf.singleton.Singleton;
import com.di.sf.strategy.AccumulatorStrategy;
import com.di.sf.strategy.NumberAccumulator;
import com.di.sf.strategy.ProductionAccumulator;
import com.di.sf.strategy.SumAccumulator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main { // Invoker
//  Command
    private static final Map<String, Action> commandMap = new HashMap<>() {{
        put("showTimeInDialog", new QueryTimeAction(new DialogTarget()));
        put("showTimeInConsole", new QueryTimeAction(new ConsoleTarget()));
    }};

    public static void main(String[] args) {
        AccumulatorStrategy prod = new ProductionAccumulator();
        AccumulatorStrategy sum = new SumAccumulator();

//      Strategy
        NumberAccumulator numberAccumulator = new NumberAccumulator();
        numberAccumulator.setStrategy(prod);
        System.out.println("Accumulated: " + numberAccumulator.accumulate(List.of(2, 4, 6, 8, 10)));

        numberAccumulator.setStrategy(sum);
        System.out.println("Accumulated: " + numberAccumulator.accumulate(List.of(2, 4, 6, 8, 10)));

        System.out.println();

//      Command
        commandMap.get(args[0]).execute();

        System.out.println();

//      Abstract Factory
        RegistrationDAOFactory factory = RegistrationDAOAbstractFactory.createFactory(DAOType.ORACLE);
        Registration registration1 = new Registration("ABC");
        Registration registration2 = new Registration("DEF");

        RegistrationDAO dao = factory.createRegistrationDAO();
        dao.persist(registration1);
        dao.update(registration1);
        dao.update(registration1);

        dao.persist(registration2);

        System.out.println();

//      Decorator
        Sundae giladK = new WhipcreamSundae(new VanillaIceCream());
        Sundae giladK2 = new VanillaIceCream();
        Sundae giladK3 = new WhipcreamSundae();
        Sundae matanP = new NutsSundae(new StrawberryIceCream());
        Sundae lev = new WhipcreamSundae(new FungeSundae(new FungeSundae(new StrawberryIceCream())));

        System.out.println("Gilad's 1st order " + giladK.describeSundae());
        System.out.println("Gilad's 2nd order " + giladK2.describeSundae());
        System.out.println("Gilad's 3rd order " + giladK3.describeSundae());
        System.out.println("Matan's order " + matanP.describeSundae());
        System.out.println("Lev's order " + lev.describeSundae());

        System.out.println();

//      Singleton
        Singleton firstRef = Singleton.getInstance();
        Singleton secondRef = Singleton.getInstance();
        System.out.println("Singleton 1st ref " + firstRef.foo());
        System.out.println("Singleton 2nd ref " + secondRef.foo());

        secondRef.foo2();
        secondRef.foo();
    }
}