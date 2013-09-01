package com.javarush.test.level12.lesson12.home01;

/* ����� getName � ������ Cat
������������ ����� getName � ������ Cat ���, ����� ��������� �������� �� ����� �������
�� - ���.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet
    {
        public String getName()
        {
            return "� - ��������";
        }
    }

    public static class Cat extends Pet
    {
        @Override
        public String getName()
        {
            return "� - ���";
        }
    }
}