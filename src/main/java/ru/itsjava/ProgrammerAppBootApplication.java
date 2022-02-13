package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itsjava.services.CoffeeHouse;

@SpringBootApplication
public class ProgrammerAppBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProgrammerAppBootApplication.class, args);

        CoffeeHouse coffeeHouse = context.getBean("coffeeHouseImpl", CoffeeHouse.class);
        coffeeHouse.barista();
    }

}
