package com.chey.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author chey
 * @Date 2021-10-18 10:43
 * @Describe bean
 */
//public class PersonDao extends AnimalDao{
public class PersonDao{
    private String name;
//    @Autowired
//    @Autowired(required = false)//属性可以为空
//    @Qualifier(value = "animal222")
    @Resource
    private AnimalDao animal;
    private String[] books;
    private List<String> hobby;
    private Map<String,String> card;
    private Set<String> games;
    private Properties info;
    private Integer age;
    private double length;

    @Override
    public String toString() {
        return "PersonDao{" +
//                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", animal=" + animal +
                ", books=" + Arrays.toString(books) +
                ", hobby=" + hobby +
                ", card=" + card +
                ", games=" + games +
                ", info=" + info +
                ", age=" + age +
                ", length=" + length +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public PersonDao(String name, @Nullable AnimalDao animal, String[] books, List<String> hobby, Map<String, String> card, Set<String> games, Properties info, Integer age) {
        this.name = name;
        this.animal = animal;
        this.books = books;
        this.hobby = hobby;
        this.card = card;
        this.games = games;
        this.info = info;
        this.age = age;
    }

    public AnimalDao getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalDao animal) {
        this.animal = animal;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public PersonDao() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
