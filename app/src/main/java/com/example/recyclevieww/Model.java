package com.example.recyclevieww;

public class Model {
    String name;
    String surname;
    String age;
    Integer img;

    public Model(String name, String surname, String age, Integer img) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public Integer getImg() {
        return img;
    }
}