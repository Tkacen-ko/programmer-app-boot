package ru.itsjava.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.domain.Coffee;

import static org.mockito.Mockito.when;

@SpringBootTest
@DisplayName("Класс CoffeeHouseImpl")
public class CoffeeHouseImplTest {

    @Configuration
    static class MyConfiguration{
        @Bean
        public IOService ioService(){
            IOServiceImpl mockIoService = Mockito.mock(IOServiceImpl.class);
            when(mockIoService.input()).thenReturn("Latte");
            return mockIoService;
        }
        @Bean
        public CoffeeService coffeeService(){
            CoffeeService coffeeService = Mockito.mock(CoffeeServiceImpl.class);
            when(coffeeService.getTypeCoffeeAndSetPrice("Latte")).thenReturn(new Coffee("Latte"));
            return coffeeService;
        }
        @Bean
        public CoffeeHouseImpl coffeeHouse(CoffeeService coffeeService,IOService ioService){
            CoffeeHouseImpl coffeeHouse = new CoffeeHouseImpl(coffeeService, ioService);

            return coffeeHouse;
        }
    }

    @Autowired
    private CoffeeHouseImpl coffeeHouse;

    @DisplayName("Корректный метод разговора с клиентом")
    @Test
    public void shouldHaveCorrectSayGoodDayNewClient(){
            coffeeHouse.barista();
    }
}
