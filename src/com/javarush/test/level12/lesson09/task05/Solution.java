package com.javarush.test.level12.lesson09.task05;

/* ����� Human � ���������� Run, Swim
������ public ����� Human(�������) �  public ���������� Run(������/������), Swim(�������).
������ � ������ ��������� �� ������ ������.
������ ��� ���������� ������ Human, �� �� �������� ������.
������ ����� Human �����������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public abstract class Human implements Run, Swim {}

    interface Run {
        public void run();
    }

    interface Swim {
        public void swim();
    }
}