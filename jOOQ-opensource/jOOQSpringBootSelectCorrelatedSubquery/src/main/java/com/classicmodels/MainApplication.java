package com.classicmodels;

import com.classicmodels.service.ClassicModelsService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final ClassicModelsService classicModelsService;

    public MainApplication(ClassicModelsService classicModelsService) {
        this.classicModelsService = classicModelsService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            System.out.println("Sample: Call fetchProductsMaxBuyPriceByProductionLine():");
            System.out.println(classicModelsService.fetchProductsMaxBuyPriceByProductionLine());

            System.out.println("Sample: Call fetchEmployeesBySumSales():");
            System.out.println(classicModelsService.fetchEmployeesBySumSales());
            
            System.out.println("Sample: Call findCustomerFullNameCityCountry()");
            System.out.println(classicModelsService.fetchCustomerFullNameCityCountry());
        };
    }
}
