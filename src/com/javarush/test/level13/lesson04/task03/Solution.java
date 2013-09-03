package com.javarush.test.level13.lesson04.task03;

import java.awt.*;

/* ��������� Animal
1. ������������ Fox �� ���������� Animal.
2. ������� ��� ���, ����� � ������ Fox ��� ������ ���� ����� - getName.
3. ������ ������� ������!

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    public interface Animal
    {
        Color getColor();
    }

    public abstract class Fox implements Animal
    {
        public String getName()
        {
            return "Fox";
        }
    }
}