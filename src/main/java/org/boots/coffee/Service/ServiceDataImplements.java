package org.boots.coffee.Service;

import org.boots.coffee.Entity.Coffee;
import org.boots.coffee.Entity.Coffeeshop;
import org.boots.coffee.Repository.CoffeeRepository;
import org.boots.coffee.Repository.CoffeeshopRepository;
import org.boots.coffee.Repository.PersonsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDataImplements {
    private final CoffeeshopRepository coffeeshopRepository;
    private final CoffeeRepository coffeeRepository;
    private final PersonsRepository personsRepository;

    public ServiceDataImplements(CoffeeshopRepository coffeeshopRepository, CoffeeRepository coffeeRepository, PersonsRepository personsRepository) {
        this.coffeeshopRepository = coffeeshopRepository;
        this.coffeeRepository = coffeeRepository;
        this.personsRepository = personsRepository;
    }

    public String getAllInfo() {
        List<Coffeeshop> coffeeshops = coffeeshopRepository.findAll();
        StringBuilder builder = new StringBuilder();
        if (!coffeeshops.isEmpty()) {
            for (Coffeeshop coffeeshop : coffeeshops) {
                builder.append(coffeeshop.toString() + "<br>");
            }
        } else {
            builder.append("Nothing");
        }
        return builder.toString();
    }

    public String getAllCoffee() {
        List<Coffee> coffees = coffeeRepository.findAll();
        StringBuilder builder = new StringBuilder();
        if (!coffees.isEmpty()) {
            for (Coffee coffeeshop : coffees) {
                builder.append(coffeeshop.toString() + "<br>");
            }
        } else {
            builder.append("Nothing");
        }
        return builder.toString();
    }
}
