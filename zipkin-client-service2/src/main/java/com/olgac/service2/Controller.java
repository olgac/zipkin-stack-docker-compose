package com.olgac.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Service2 service2;

    @GetMapping("/get")
    String get(){
        return service2.get();
    }
}
