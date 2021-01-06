package com.example.demo.AnimalImpl;

import com.example.demo.Animal.Animal;

public class AnimalImpl implements Animal {
    @Override
    public void eat() {
        System.out.println("吃热狗");
    }


public static void main(String[] args){
    Animal a = new AnimalImpl();
    a.eat();
}
}
