package com.di.sf.factory.abstrct.api;

import com.di.sf.factory.abstrct.mysql.MySqlRegistrationDAOFactory;
import com.di.sf.factory.abstrct.oracle.OracleRegistrationDAOFactory;

public class RegistrationDAOAbstractFactory { // ConcreteFactory
    public static RegistrationDAOFactory createFactory(DAOType discriminator) { // factoryMethod
        RegistrationDAOFactory ret;

        switch (discriminator) {
            case MYSQL: ret = new MySqlRegistrationDAOFactory();
                        break;
            case ORACLE: ret = new OracleRegistrationDAOFactory();
                        break;
            default: throw new IllegalArgumentException();
        }

        return ret;
    }
}
