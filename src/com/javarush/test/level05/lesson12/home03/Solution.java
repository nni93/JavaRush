package com.javarush.test.level05.lesson12.home03;

/* ������ ������ Dog, Cat, Mouse
������ ������ Dog, Cat, Mouse. ������ �� ��� ���� � ������ �����, �� ���� �����. ������ ������� ��� ������ �������� ��� � ������. ��� �����, ��� ������ ���������.
������:
Mouse jerryMouse = new Mouse(�Jerry�, ������, ������ ������)

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        Dog spaikeDog = new Dog("Spaike", 120, 30);

        Cat tomCat = new Cat("Tom", 20, 15);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}