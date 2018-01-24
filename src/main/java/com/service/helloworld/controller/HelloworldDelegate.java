package com.service.helloworld.controller;

import org.springframework.stereotype.Component;


@Component
public class HelloworldDelegate implements Helloworld {

    public String helloworld(String name){

        // Do Some Magic Here!
        return "hi, " + name;
    }
}
