package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* ����������� ����
1. � ������ Cat ������ public ����������� ���������� cats (ArrayList<Cat>).
2. ����� ��� ������ �������� ���� (������ ������� Cat) � ���������� cats ����������� ���� ����� ���. ������� 10 �������� Cat.
3. ����� printCats ������ �������� ���� ����� �� �����. ����� ������������ ���������� cats.

@author Nikolaieva Natalia
*/

public class Cat {
    public Cat() {
    }
    static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        System.out.println(cats);
    }
}