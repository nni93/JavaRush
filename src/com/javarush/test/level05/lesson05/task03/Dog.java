package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.

@author Nikolaieva Natalia
*/

public class Dog {
    public String name;
    int age;

    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setName(String name) {
    	this.name = name;   	
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public static void main(String[] args) {
   	
    	Dog dog = new Dog();
    	dog.setName("Bim");
    	dog.setAge(3);
    	System.out.println("Dog name: " + dog.getName() + " Dog age: " + dog.getAge());
    }
}