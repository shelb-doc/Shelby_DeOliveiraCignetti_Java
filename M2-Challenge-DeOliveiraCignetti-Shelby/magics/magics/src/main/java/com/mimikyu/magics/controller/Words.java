package com.mimikyu.magics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Words {

    @RequestMapping(value="/word", method = RequestMethod.GET)
    String giveWords(){
        return "words";
    }
}
