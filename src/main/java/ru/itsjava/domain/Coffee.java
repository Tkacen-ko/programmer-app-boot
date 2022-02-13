package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Coffee {
    private final String type;

    @Override
    public String toString() {
        return type;
    }
}
