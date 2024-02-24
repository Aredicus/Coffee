package org.boots.coffee.Controllers;

import org.boots.coffee.Service.ServiceDataImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInfoCoffee {

    private final ServiceDataImplements serviceDataImplements;

    public ControllerInfoCoffee(ServiceDataImplements serviceDataImplements) {
        this.serviceDataImplements = serviceDataImplements;
    }


    @GetMapping("/coffeebox")
    public ResponseEntity<String> coffeeBox() {
        return new ResponseEntity<>("What do You want?", HttpStatus.ACCEPTED);
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
