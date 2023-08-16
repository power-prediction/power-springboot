package com.power_prediction.jskp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;


@RestController
//@RequestMapping("/api/powerinfo")
public class Power_Controller {
    @Autowired
    private Power_Repository power_repository;
    
    @PostMapping("/send_db")
    public Power createdb(@RequestBody Power powerinfo) {
        System.out.println("왔어!");
//        Power power = convertToPower(powerinfo)
        return power_repository.save(powerinfo);
    }
}

