package com.example;

import java.util.List;

public class Lion {

    private  Feline feline; // поле добавлено для реализации инъекции зависимостей

    boolean hasMane;

    public Lion(Feline feline){
        this.feline = feline;
    } // добавлен конструктор для поля feline

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

}
