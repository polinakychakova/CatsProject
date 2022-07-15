package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

//    Feline feline = new Feline();

//    public int getKittens() {
//        return feline.getKittens();
//    }
    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return Animal.getFood("Хищник");
    }

    // Для реализаци изолированнасти класса Lion от Feline в класс Lion добавлен метод getKittens()
    // который возвращает количество детенышей, аналогично с методом из класса Feline

    // Для изоляции метода getFood был использован метод родителя Animal.getFood(String)
}
