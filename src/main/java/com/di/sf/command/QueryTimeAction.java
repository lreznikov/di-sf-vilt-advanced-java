package com.di.sf.command;

import java.time.LocalDateTime;

public class QueryTimeAction implements Action { // ConcreteCommand
    private final Target target;

    public QueryTimeAction(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.displayTime(LocalDateTime.now());
    }
}
