package com.hero.springboot.controller;
import com.hero.springboot.Hero.Hero;
import com.hero.springboot.dao.imp.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @CrossOrigin 解决跨域限制
 */
@RestController
public class HeroController
{
    @Autowired
    HeroService heroService;


    @CrossOrigin(origins = "*")
    @ResponseBody
    @GetMapping(path = "api/heroes")
    public List<Hero> getHeroes() throws Exception {
        return heroService.getHeroes();
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @GetMapping(path = "api/heroes/{id}")
    public Hero getHero(@PathVariable("id") Integer id) throws Exception {
        return heroService.getHero(id);
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @PutMapping(path = "api/heroes")
    public int updateHero(@RequestBody Hero hero) throws Exception {
        return  heroService.updateHero(hero);
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @PostMapping(path = "api/heroes")
    public int addHero(@RequestBody Hero hero) throws Exception {
        return  heroService.addHero(hero);
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @DeleteMapping(path = "api/heroes/{id}")
    public int deleteHero(@PathVariable("id") Integer id) throws Exception {
        return heroService.deleteHero(id);
    }
}