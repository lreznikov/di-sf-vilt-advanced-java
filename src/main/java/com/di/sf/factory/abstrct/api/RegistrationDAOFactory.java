package com.di.sf.factory.abstrct.api;

public interface RegistrationDAOFactory { // AbstractFactory
                                          // Product in context of Factory Method
    RegistrationDAO createRegistrationDAO();
}
