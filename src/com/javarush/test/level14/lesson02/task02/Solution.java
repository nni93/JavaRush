package com.javarush.test.level14.lesson02.task02;

/* Bingo-2
������� ������� 'Cat o = new Cat();' ���, ����� ��������� ������ "Bingo!"

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat o = new TomCat();

        boolean isCat = o instanceof Cat;
        boolean isMoveable = o instanceof Moveable;
        boolean isTom = o instanceof TomCat;

        if (isCat && isMoveable && isTom) System.out.println("Bingo!");

    }

    interface Moveable
    {
    }

    static class Cat
    {
    }

    static class TomCat extends Cat implements Moveable
    {

    }
}