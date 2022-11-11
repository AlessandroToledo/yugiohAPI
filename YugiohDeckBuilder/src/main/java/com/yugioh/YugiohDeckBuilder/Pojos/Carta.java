package com.yugioh.YugiohDeckBuilder.Pojos;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Carta {

    private String nome;

    private int atk;

    private int def;

    private int level;

    public Carta() {
    }

    public Carta(String nome, int atk, int def, int level) {
        this.nome = nome;
        this.atk = atk;
        this.def = def;
        this.level = level;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtk() {
        return this.atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}