package com.di.sf.command;

import java.time.LocalDateTime;

public class ConsoleTarget implements Target {
    @Override
    public void displayTime(LocalDateTime dateTime) {
        System.out.println("The time is: " + dateTime.toString());
    }
}
