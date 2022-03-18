package com.chey.dao;

/**
 * @Author chey
 * @Date 2021-10-22 15:51
 * @Describe bean
 */
public class AnimalDao {
    public String sex;

    public AnimalDao(String sex) {
        this.sex = sex;
    }

    public AnimalDao() {
    }

    @Override
    public String toString() {
        return "AnimalDao{" +
                "sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
