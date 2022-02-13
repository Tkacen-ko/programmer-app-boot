package ru.itsjava.services;

import org.springframework.stereotype.Service;
import ru.itsjava.domain.Coffee;

@Service
public class CoffeeServiceImpl implements CoffeeService {
    private double price;

    @Override
    public Coffee getTypeCoffeeAndSetPrice(String coffeeType) {
        if (coffeeType.equals("Latte")) {
            this.price = 12.50;
            return new Coffee("Latte");
        } else if (coffeeType.equals("Cappuccino")) {
            this.price = 15.15;
            return new Coffee("Cappuccino");
        } else if (coffeeType.equals("Cocoa")) {
            this.price = 18.11;
            return new Coffee("Cocoa");
        } else {
            return new Coffee("?");
        }
    }

    @Override
    public double getPrice() {
        return price;
    }
}
