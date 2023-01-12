package com.di.sf.factory.abstrct.mysql;

import com.di.sf.factory.abstrct.api.RegistrationDAO;
import com.di.sf.factory.abstrct.api.RegistrationDAOFactory;

public class MySqlRegistrationDAOFactory implements RegistrationDAOFactory { // ConcreteFactory2
    @Override
    public RegistrationDAO createRegistrationDAO() {
        return new MySqlRegistrationDAO();
    }
}
