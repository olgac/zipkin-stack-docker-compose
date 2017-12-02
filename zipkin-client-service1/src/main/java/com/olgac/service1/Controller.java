package com.olgac.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Service1 service1;

    @GetMapping("/get")
    String get(){
        return  service1.get();
    }
}
