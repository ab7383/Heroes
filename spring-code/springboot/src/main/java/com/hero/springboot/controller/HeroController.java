package com.hero.springboot.controller;
import com.hero.springboot.Hero.Hero;
import com.hero.springboot.dao.HeroDao;
import com.hero.springboot.dao.imp.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroController
{
    @Autowired
    HeroService heroService;

    private Logger logger = LoggerFactory.getLogger(HeroController.class);

    @CrossOrigin(origins = "*")
    @ResponseBody
    @GetMapping(path = "api/heroes")
    public List<Hero> getHeroes() throws Exception {
        logger.info("-------------------getHeroes--------------------");
        List<Hero> Heroes = heroService.getHeroes();
        return Heroes;
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @GetMapping(path = "api/heroes/{id}")
    public Hero getHero(@PathVariable("id") Integer id) throws Exception {
        logger.info("-------------------getHero--------------------");
        logger.info("hero's id is: " + id);
        Hero hero = heroService.getHero(id);
        return hero;
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @PutMapping(path = "api/heroes")
    public int updateHero(@RequestBody Hero hero) throws Exception {
        logger.info("-------------------update Hero--------------------");
        return  heroService.updateHero(hero);
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @PostMapping(path = "api/heroes")
    public int addHero(@RequestBody Hero hero) throws Exception {
        logger.info("-------------------add Hero--------------------");
        return  heroService.addHero(hero);
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @DeleteMapping(path = "api/heroes/{id}")
    public int deleteHero(@PathVariable("id") Integer id) throws Exception {
        logger.info("-------------------delete Hero--------------------");
        logger.info("hero's id is: " + id);
        return heroService.deleteHero(id);
    }
}