package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет

@author Nikolaieva Natalia
*/

public class Dog
{
    String name, color;
    int growth;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int growth){
        this.name = name;
        this.growth = growth;
    }
    public void initialize(String name, int growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.initialize("Bim");
        dog.initialize("Bim", 3);
        dog.initialize("Bim", 3, "black");
    }
}
