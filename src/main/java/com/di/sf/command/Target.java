package com.di.sf.command;

import java.time.LocalDateTime;

public interface Target { // Receiver
    void displayTime(LocalDateTime dateTime);
}
