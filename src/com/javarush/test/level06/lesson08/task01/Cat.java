package com.javarush.test.level06.lesson08.task01;

/* ����� Cat � ����������� ���������� catCount
������� ����������� ���������� int catCount � ������ Cat. ������ ����������� [public Cat()], � ������� ���������� ������ ���������� �� 1.

@author Nikolaieva Natalia
*/

public class Cat
{
    static int catCount;
    public Cat() {
        catCount++;
    }
}
