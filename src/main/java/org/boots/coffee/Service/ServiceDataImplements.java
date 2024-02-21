package org.boots.coffee.Service;

import org.boots.coffee.Entity.Coffee;
import org.boots.coffee.Entity.Coffeeshop;
import org.boots.coffee.Entity.Person;
import org.boots.coffee.Repository.CoffeeRepository;
import org.boots.coffee.Repository.CoffeeshopRepository;
import org.boots.coffee.Repository.PersonsRepository;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    public String newBuy(JSONObject object) {
        try {
            String personName = object.getString("name");
            String coffeeName = object.getString("coffee");
            Optional<Coffee> coffee = coffeeRepository.getCoffeeByName(coffeeName);
            Optional<Person> person = personsRepository.getPersonByName(personName);
            Coffeeshop coffeeshop = new Coffeeshop();
            coffeeshop.setPersonid(person.orElseThrow().getId());
            coffeeshop.setCoffeeid(coffee.orElseThrow().getId());
            coffeeshopRepository.insertNewTransaction(coffeeshop.getPersonid(), coffeeshop.getCoffeeid());
        } catch (JSONException | RuntimeException e ) {
            return "Not correct";
        }
        return "Correct";
    }
}
