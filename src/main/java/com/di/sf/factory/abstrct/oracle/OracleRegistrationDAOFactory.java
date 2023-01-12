package com.di.sf.factory.abstrct.oracle;

import com.di.sf.factory.abstrct.api.RegistrationDAO;
import com.di.sf.factory.abstrct.api.RegistrationDAOFactory;

public class OracleRegistrationDAOFactory implements RegistrationDAOFactory { // ConcreteFactory1
                                                                              // Concrete Product in context of Factory Method
    @Override
    public RegistrationDAO createRegistrationDAO() {
        return new OracleRegistrationDAO();
    }
}
