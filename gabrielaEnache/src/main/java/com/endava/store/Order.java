package com.endava.store;

import java.time.LocalDateTime;

public interface Order {
    float sum();

    int count();

    LocalDateTime date();
}
