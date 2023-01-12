package com.di.sf.factory.abstrct.mysql;

import com.di.sf.factory.abstrct.api.Registration;
import com.di.sf.factory.abstrct.api.RegistrationDAO;

public class MySqlRegistrationDAO implements RegistrationDAO { // ConcreteProductA2
    @Override
    public void persist(Registration registration) {
        System.out.println("Persisting Registration " + registration.getExample() + " the MY SQL way");
    }

    @Override
    public void update(Registration registration) {
        System.out.println("Updating Registration " + registration.getExample() + " the MY SQL way");
    }
}
