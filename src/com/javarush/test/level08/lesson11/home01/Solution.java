package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/* Set �� �����
1. ������ ������ Solution ������� public static ����� ��� � Cat.
2. ����������� ����� createCats, �� ������ ��������� ��������� (Set) ����� � ��������� � ���� 3 ����.
3. � ������ main ������� ������ ���� �� Set cats.
4. ����������� ����� printCats, �� ������ ������� �� ����� ���� �����, ������� �������� �� ���������. ������ ��� � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        cats.remove(Cat.cat1);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> set = new HashSet<Cat>();
            set.add(Cat.cat1);
            set.add(Cat.cat2);
            set.add(Cat.cat3);

        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        System.out.println(cats);
    }

    public static class Cat {

        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
        static Cat cat3 = new Cat();
    }
}