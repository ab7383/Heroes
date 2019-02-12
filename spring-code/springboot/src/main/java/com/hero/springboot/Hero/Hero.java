package com.hero.springboot.Hero;

import org.springframework.stereotype.Component;

@Component
public class Hero {
    private int id;
    private String name;

    Hero ()
    {}

    public  Hero (int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }
}
