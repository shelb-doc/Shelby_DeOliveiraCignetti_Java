package com.mimikyu.magics.controller;

import com.mimikyu.magics.models.Quotes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
class QuotesController{
    Random random = new Random();

    private static List<Quotes> quotesList = new ArrayList<>(Arrays.asList(
            new Quotes(1,"Fred Rogers","Listening is where love begins: listening to ourselves and then to our neighbors."),
            new Quotes(2,"Dan Mueller","SUCCESS!"),
            new Quotes(3,"Arnold Palmer","The more I practice the luckier I get."),
            new Quotes(4,"Walt Disney","All our dreams can come true, if we have the courage to pursue them."),
            new Quotes(5,"Ash Ketchum","Spearows! Do you know who I am? I'm Ash, from the town of Pallet. I'm destined to be the world's number one Pokémon master!"),
            new Quotes(6,"Eleanor Roosevelt","If life were predictable it would cease to be life, and be without flavor."),
            new Quotes(7,"Benjamin Franklin","Tell me and I forget. Teach me and I remember. Involve me and I learn."),
            new Quotes(8,"Babe Ruth","Never let the fear of striking out keep you from playing the game."),
            new Quotes(9,"Thomas Jefferson","I find that the harder I work, the more luck I seem to have."),
            new Quotes(10,"Audrey Hepburn","Nothing is impossible, the word itself says, ‘I'm possible!")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quotes getRandomQuote(){
        int randomQuoteIndex = random.nextInt(quotesList.size());
        return quotesList.get(randomQuoteIndex);
    }
}

