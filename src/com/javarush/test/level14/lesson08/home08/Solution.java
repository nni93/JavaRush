package com.javarush.test.level14.lesson08.home08;

/* ����������� ������
1. ��������, ��� ������� ���������� Swimable(�������� �������) � Walkable(�������� ������) � ������� OceanAnimal(�������� ������).
2. ���������� ��������� ������������ ����������� � ������ OceanAnimal.
3. ��������, ��� ����� ���� ������� ������  Orca(�������), Whale(���), Otter(�����) � ������� OceanAnimal.
4. ���������� ��������� ������������ ����� �������� Orca, Whale, Otter � ������� OceanAnimal.
5. ��������, ����� ����� ������ ����������� ��������� Walkable � �������� �������� ����� ������.
6. ��������, ����� �������� ��� �� ����� ������� � �������� ��� ��������� Swimable.
*/

public class Solution
{
    public static void main(String[] args)
    {

        Swimable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();

    }

    public static void test(Swimable animal)
    {
        animal.swim();
    }

    static interface Walkable
    {
        void walk();
    }

    static interface Swimable
    {
        void swim();
    }

    static abstract class OceanAnimal implements Swimable
    {
        public void swim()
        {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming()
        {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal
    {

        @Override
        Swimable getCurrentAnimal()
        {
            return this;
        }
    }

    static class Whale extends OceanAnimal
    {

        @Override
        Swimable getCurrentAnimal()
        {
            return this;
        }
    }

    static class Otter implements Walkable, Swimable
    {
        @Override
        public void walk()
        {
        }

        @Override
        public void swim()
        {
        }
    }
}