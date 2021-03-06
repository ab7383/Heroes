package com.hero.springboot.dao;

import com.hero.springboot.Hero.Hero;


import java.util.List;

public interface HeroDao {

    //获取英雄列表
    public List<Hero> getHeroes()throws Exception;
    //根据ID获得单个英雄
    public Hero getHero(int id)throws Exception;
    //根据ID更新英雄信息
    public int updateHero(Hero hero)throws Exception;
    //添加英雄
    public int addHero(Hero hero)throws Exception;
    //根据id删除英雄
    public int deleteHero(int id)throws Exception;
}
