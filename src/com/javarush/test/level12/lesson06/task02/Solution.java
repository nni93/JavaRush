package com.javarush.test.level12.lesson06.task02;

/* ������� ���. ������ ������
������� ���, ����� ��������� ���������������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {

    }


    public static abstract class Pet
    {
        public String getName()
        {
            return "� - �������";
        }

        public abstract Pet getChild();
    }

}