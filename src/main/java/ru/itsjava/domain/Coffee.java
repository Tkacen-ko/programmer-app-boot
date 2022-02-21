package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Coffee {
    private final String type;

    @Override
    public String toString() {
        return type;
    }
}
