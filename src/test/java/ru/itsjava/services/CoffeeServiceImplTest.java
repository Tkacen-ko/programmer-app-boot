package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.domain.Coffee;

@SpringBootTest
@DisplayName("Класс CoffeeServiceImpl")
public class CoffeeServiceImplTest {

    @Configuration
    static class MyConfiguration{
        @Bean
        public CoffeeServiceImpl coffeeService(){
            return new CoffeeServiceImpl();
        }
    }

    @Autowired
    private CoffeeServiceImpl coffeeService;

    @DisplayName("Должен корректно возвращать нужный кофе")
    @Test
    public void shouldHaveCorrectMethodGetTypeCoffeeAndSetPrice(){
        Coffee latte = coffeeService.getTypeCoffeeAndSetPrice("Latte");
        Assertions.assertEquals(latte.getType(),"Latte");
    }
}
