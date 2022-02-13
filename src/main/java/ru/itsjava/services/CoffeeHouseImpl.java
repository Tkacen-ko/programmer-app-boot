package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.domain.Coffee;

@RequiredArgsConstructor
@Service
public class CoffeeHouseImpl implements CoffeeHouse {
    private final CoffeeService coffeeService;
    private final IOService ioService;

    @Override
    public void barista() {
        System.out.println("Good day! What kind of coffee do you want?");
        Coffee coffee = coffeeService.getTypeCoffeeAndSetPrice(ioService.input());
        if (!coffee.toString().equals("?")) {
            System.out.println("Your " + coffee + " sir. It will cost " + coffeeService.getPrice() + " dollars");
        } else {
            System.out.println("Sorry! We don't have this drink...");
        }
    }
}
