package com.javarush.test.level12.lesson12.home02;

/* ����� setName � ������ Cat
������������ ����� setName � ������ Cat ���, ����� ��������� �������� �� ����� �������
�� - ���.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pet pet = new Cat();
        pet.setName("� - ��������");

        System.out.println(pet.getName());
    }

    public static class Pet
    {
        protected String name;

        public Pet()
        {
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

    }

    public static class Cat extends Pet
    {
        @Override
        public void setName(String name)
        {
            this.name = "� - ���";
        }
    }
}