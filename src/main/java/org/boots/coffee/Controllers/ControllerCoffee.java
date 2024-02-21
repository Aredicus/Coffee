package org.boots.coffee.Controllers;

import org.boots.coffee.Service.ServiceDataImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCoffee {

    private final ServiceDataImplements serviceDataImplements;

    @Autowired
    public ControllerCoffee(ServiceDataImplements serviceDataImplements) {
        this.serviceDataImplements = serviceDataImplements;
    }


    @GetMapping("/coffeebox")
    public String coffeeBox() {
        return "What do you want?";
    }

    @GetMapping("/getallcoffee")
    public String getAllCoffee(){
        return serviceDataImplements.getAllCoffee();
    }

    @GetMapping("/seeall")
    public String seeAll() {
        return serviceDataImplements.getAllInfo();
    }
}
