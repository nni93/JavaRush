package com.javarush.test.level06.lesson11.home01;

/* ����� Cat � ����������� ���������� catCount
� ������ Cat ������ ����������� ���������� public int catCount.
������ ����������� [public Cat()]. ����� ��� ������ �������� ���� (������ ������� Cat) ����������� ����������
catCount ������������� �� 1. ������� 10 �������� Cat � ������� �������� ���������� catCount �� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++) {
        Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        public static int catCount;

        public Cat() {
            catCount++;
        }
    }

}