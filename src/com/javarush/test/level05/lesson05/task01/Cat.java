package com.javarush.test.level05.lesson05.task01;

/* ������� ����� Cat
������� ����� Cat. � ���� ������ ���� ��� (name, String), ������� (age, int), ��� (weight, int), ���� (strength, int).

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


