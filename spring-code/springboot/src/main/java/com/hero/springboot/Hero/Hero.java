package com.hero.springboot.Hero;

import org.springframework.stereotype.Component;

@Component
public class Hero {
    private int id;
    private String name;
    private String standName;//替身名称
    private String strength;//力量
    private String speed;//速度
    private String distance;//射程
    private String growth;//成长性
    private String precise;//精密度 
    private String persistentce;//持久力
    private String description;//能力描述

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

    /**
     * @return the standName
     */
    public String getStandName() {
        return standName;
    }

    /**
     * @param standName the standName to set
     */
    public void setStandName(String standName) {
        this.standName = standName;
    }

    /**
     * @return the strength
     */
    public String getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * @return the speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * @return the distance
     */
    public String getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     * @return the growth
     */
    public String getGrowth() {
        return growth;
    }

    /**
     * @param growth the growth to set
     */
    public void setGrowth(String growth) {
        this.growth = growth;
    }

    /**
     * @return the precise
     */
    public String getPrecise() {
        return precise;
    }

    /**
     * @param precise the precise to set
     */
    public void setPrecise(String precise) {
        this.precise = precise;
    }

    /**
     * @return the persistentce
     */
    public String getPersistentce() {
        return persistentce;
    }

    /**
     * @param persistentce the persistentce to set
     */
    public void setPersistentce(String persistentce) {
        this.persistentce = persistentce;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
