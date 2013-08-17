package com.javarush.test.level06.lesson05.task03;

/* 10 000 �������� Cat � Dog
������� � ����� 10 000 �������� Cat � Dog. (Java-������ ������ ������ ���������� ��������������, � ����� finalize ���� ��� �� ���������).

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }

    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}