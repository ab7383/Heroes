package com.hero.springboot.dao.imp;

import com.hero.springboot.Hero.Hero;
import com.hero.springboot.dao.HeroDao;
import com.hero.springboot.mappers.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeroService implements HeroDao {

    @Autowired
    private HeroMapper heroMapper;
    @Override
    public List<Hero> getHeroes() throws Exception {
        return heroMapper.getHeroes();
    }

    @Override
    public Hero getHero(int id ) throws Exception {
        return heroMapper.getHero(id);
    }

    @Override
    public int updateHero(Hero hero) throws Exception {
        return heroMapper.updateHero(hero);
    }

    @Override
    public int addHero(Hero hero) throws Exception {
        return heroMapper.addHero(hero);
    }

    @Override
    public int deleteHero(int id) throws Exception {
        return heroMapper.deleteHero(id);
    }
}
