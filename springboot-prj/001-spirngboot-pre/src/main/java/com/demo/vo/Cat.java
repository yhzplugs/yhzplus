package com.demo.vo;

public class Cat {
    private String catId;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Cat{" +
                "catId='" + catId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
