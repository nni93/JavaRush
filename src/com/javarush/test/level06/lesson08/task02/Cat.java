package com.javarush.test.level06.lesson08.task02;

/* ����������� ������: int getCatCount() � setCatCount(int)
��������  � ������ Cat ��� ����������� ������: int getCatCount() � setCatCount(int), � ������� ������� ����� ��������/�������� ���������� ����� (���������� catCount)

@author Nikolaieva Natalia
*/

public class Cat
{
    private static int catCount = 0;

    public static void main(String[] args) {
        Cat cat = new Cat();
        catCount = Cat.getCatCount();
        System.out.println(catCount);
        Cat.setCatCount(3);
        System.out.println(catCount);
    }

    public Cat()
    {
        catCount++;
    }

    public static int getCatCount()
    {
        return catCount;

    }

    public static void setCatCount(int catCount)
    {
      Cat.catCount = catCount;

    }
}