package com.javarush.test.level04.lesson02.task05;

/* ���������� ���������� �����
�������� ���, ����� ��������� ��������� ���������� ��������� ����� (count) � �� ����� ���������� ��������� �� ����������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        int cat1count = Cat.count + 1;

        Cat cat2 = new Cat();
        Cat.count = cat1count + 1;

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}