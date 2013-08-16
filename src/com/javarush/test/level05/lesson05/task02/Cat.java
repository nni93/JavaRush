package com.javarush.test.level05.lesson05.task02;


/* ����������� ����� fight
����������� ����� boolean fight(Cat anotherCat):
����������� �������� ����� ����� � ����������� �� �� ����, �������� � ����.
����������� ��������� ������. ����� ������ ����������, �������� �� �� (this) ��� ��� ���,
�.�. ���������� true, ���� �������� � false - ���� ���.
������ ����������� �������:
���� cat1.fight(cat2) = true , �� cat2.fight(cat1) = false

@author Nikolaieva Natalia
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;
    
    public void setCatParameters(String catName, int catAge, int catWeight, int catStrength){
        name = catName;
        age = catAge;
        weight = catWeight;
        strength = catStrength;
    }
    
    public static void main(String[] args){
    	Cat cat1 = new Cat();
        cat1.setCatParameters("Vaska", 2, 3, 4);
        Cat cat2 = new Cat();
        cat2.setCatParameters("Pushok", 1, 2, 3);
        
       System.out.println(cat1.fight(cat2)); 
    }
    public boolean fight (Cat anotherCat)
    {
    	if ((this.age > anotherCat.age) & (this.weight > anotherCat.weight) & (this.strength > anotherCat.strength))
		return true;
    	else 
    	return false;
    }
}
