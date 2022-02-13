package ru.itsjava.services;

import ru.itsjava.domain.Coffee;

public interface CoffeeService {
    public Coffee getTypeCoffeeAndSetPrice(String coffeeType);
    public double getPrice();
}
