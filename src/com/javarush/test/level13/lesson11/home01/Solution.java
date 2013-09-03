package com.javarush.test.level13.lesson11.home01;

/* ������������ ������
����� ��� ������������ ������ � ���������� Button.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject
    {
        String NAME = "SimpleObject";
        void onPress();
    }

    interface Button extends SimpleObject
    {
        final String NAME = "Submit";
        void onPress();
    }
}