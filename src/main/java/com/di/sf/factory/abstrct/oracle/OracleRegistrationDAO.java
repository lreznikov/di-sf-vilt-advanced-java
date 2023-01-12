package com.di.sf.factory.abstrct.oracle;

import com.di.sf.factory.abstrct.api.Registration;
import com.di.sf.factory.abstrct.api.RegistrationDAO;

public class OracleRegistrationDAO implements RegistrationDAO { // ConcreteProductA1
    @Override
    public void persist(Registration registration) {
        System.out.println("Persisting Registration " + registration.getExample() + " the ORACLE way");
    }

    @Override
    public void update(Registration registration) {
        System.out.println("Updating Registration " + registration.getExample() + " the ORACLE way");
    }
}
