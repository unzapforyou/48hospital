package com.seoul.his.com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seoul.his.com.system.service.ComBaseServiceFacade;



@RestController
public class LogController {

    @Autowired
    private ComBaseServiceFacade comBaseServiceFacade;

    @RequestMapping(value="/log/{id}/{time}", method=RequestMethod.GET)
    public void insertLog(@PathVariable String id,@PathVariable String time) {
    	comBaseServiceFacade.insertLog(id,time); 	
    }    
}

