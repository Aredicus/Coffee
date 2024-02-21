package org.boots.coffee.Controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.boots.coffee.Service.ServiceDataImplements;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ControllerUpdateCoffee {
    private final ServiceDataImplements serviceDataImplements;

    public ControllerUpdateCoffee(ServiceDataImplements serviceDataImplements) {
        this.serviceDataImplements = serviceDataImplements;
    }

    @PostMapping("/buycoffee")
    public String buyCoffee(@RequestBody String s) throws JSONException {
        return serviceDataImplements.newBuy(new JSONObject(s));
    }
}
