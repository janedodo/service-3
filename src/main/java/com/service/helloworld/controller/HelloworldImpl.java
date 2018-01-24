package com.service.helloworld.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-24T02:36:49.767Z")

@RpcSchema(schemaId = "helloworld")
public class HelloworldImpl implements Helloworld{

    @Autowired
    private HelloworldDelegate helloworldDelegate;


    public String helloworld(String name) {

        return helloworldDelegate.helloworld(name);
    }

}
