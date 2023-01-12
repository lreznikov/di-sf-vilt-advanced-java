package com.di.sf.uml;

import java.util.List;

public abstract class Store {
    public abstract void store(List<Article> articles);

    public abstract List<Article> retrieve();
}
