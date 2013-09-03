package com.javarush.test.level13.lesson06.task01;

/* Dog, Cat � Mouse
1. ������� ������ Dog, Cat � Mouse.
2. ����������� ���������� � ����������� �������, �������� ���:
- ���(Cat) ����� �������������, ����� ����-�� ������ � ����� ���� ��� ������.
- ����(Mouse) ����� ������������� � ����� ���� �������.
- ������(Dog) ����� ������������� � ������ ����-��.

@author Nikolaieva Natalia
*/

public class Solution
{

    public interface Moveable //����� ���������
    {
        void move();
    }

    public interface Eatable  //����� ���� ������
    {
        void eaten();
    }

    public interface Eat  //����� ����-������ ������
    {
        void eat();
    }

    abstract class Dog implements Moveable, Eat{
    }

    abstract class Cat implements Moveable, Eat, Eatable{
    }

    abstract class Mouse implements Moveable, Eatable{
    }
}