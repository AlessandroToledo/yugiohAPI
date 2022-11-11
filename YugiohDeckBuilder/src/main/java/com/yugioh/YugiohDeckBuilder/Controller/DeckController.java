package com.yugioh.YugiohDeckBuilder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/deck")
public class DeckController {
    @PostMapping(value = "/create")
    public String createDeck() {
        return "GABRIEL";
    }
}