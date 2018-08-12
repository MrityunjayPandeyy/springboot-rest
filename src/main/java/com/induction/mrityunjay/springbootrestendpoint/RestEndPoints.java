package com.induction.mrityunjay.springbootrestendpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoints {

    @RequestMapping("/getname")
    public User getEndPoint(@RequestParam(value = "id") String id){
        User user = new User();
        user.setId(1);
        user.setName("mrityunjay");
        return user;

    }
}

