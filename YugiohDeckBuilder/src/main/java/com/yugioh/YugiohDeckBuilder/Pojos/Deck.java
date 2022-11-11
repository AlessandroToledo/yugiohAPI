package com.yugioh.YugiohDeckBuilder.Pojos;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import java.util.List;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Deck {

    private int id;

    private String name;

    private List<String> cartas;

    public Deck() {
    }

    public Deck(int id, String name, List<String> cartas) {
        this.id = id;
        this.name = name;
        this.cartas = cartas;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCartas() {
        return this.cartas;
    }

    public void setCartas(List<String> cartas) {
        this.cartas = cartas;
    }
}