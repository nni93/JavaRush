package com.javarush.test.level13.lesson02.task08;

/* ��� ��� ���
1. ������ ��������� Person.
2. ������ � ���� ����� isAlive(), ������� ���������, ��� ������� ��� ���.
3. �������, ����� ��� ������ ���������� ���� �����.
4. ������ ��������� Presidentable.
5. ��������� ��������� Presidentable �� ���������� Person.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Person {
        public boolean isAlive(boolean alive);
    }

    interface Presidentable extends Person{
    }
}