package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).

@author Nikolaieva Natalia
*/

public class Cat
{
    public String name;
    public int age, weight, strength;
    
    public void setCatParameters(String catName, int catAge, int catWeight, int catStrength){
        name = catName;
        age = catAge;
        weight = catWeight;
        strength = catStrength;
    }
public static void main(String[] args){
	Cat cat = new Cat();
    cat.setCatParameters("Vaska", 2, 3, 4);
}
}
