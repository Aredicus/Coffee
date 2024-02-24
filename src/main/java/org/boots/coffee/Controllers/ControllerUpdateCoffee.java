package org.boots.coffee.Controllers;

import org.boots.coffee.Service.ServiceDataImplements;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerUpdateCoffee {
    private final ServiceDataImplements serviceDataImplements;

    public ControllerUpdateCoffee(ServiceDataImplements serviceDataImplements) {
        this.serviceDataImplements = serviceDataImplements;
    }

    @PostMapping("/buycoffee")
    public ResponseEntity<String> buyCoffee(@RequestBody String s) throws JSONException {
        return serviceDataImplements.newBuy(new JSONObject(s));
    }

    @PostMapping("/newcoffe")
    public String newCoffee(@RequestBody String s) throws JSONException {
        return serviceDataImplements.newCoffee(new JSONObject(s));
    }
}
