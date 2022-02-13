package ru.itsjava.services;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class IOServiceImpl implements IOService {
    private final BufferedReader reader;

    public IOServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @SneakyThrows
    @Override
    public String input() {
        return reader.readLine();
    }
}
