package ru.itsjava.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.itsjava.domain.Coffee;

@Service
public class CoffeeServiceImpl implements CoffeeService {
    private String firstDrink;
    private String secondDrink;
    private String thirdDrink;
    private double price;

    public CoffeeServiceImpl(@Value("${cofee.firstDrink}") String firstDrink,
                             @Value("${cofee.secondDrink}") String secondDrink,
                             @Value("${cofee.thirdDrink}") String thirdDrink){
        this.firstDrink = firstDrink;
        this.secondDrink = secondDrink;
        this.thirdDrink = thirdDrink;
    }

    @Override
    public Coffee getTypeCoffeeAndSetPrice(String coffeeType) {
        if (coffeeType.equals(firstDrink)) {
            this.price = 12.50;
            return new Coffee(firstDrink);
        } else if (coffeeType.equals(secondDrink)) {
            this.price = 15.15;
            return new Coffee(secondDrink);
        } else if (coffeeType.equals(thirdDrink)) {
            this.price = 18.11;
            return new Coffee(thirdDrink);
        } else {
            return new Coffee("?");
        }
    }

    @Override
    public double getPrice() {
        return price;
    }
}
