package com.javarush.test.level13.lesson04.task02;

/* ����������� ����
��������� ��� ���, ����� ��������� ����������� � �������� "� ���������� � �����������".
����� main ������ ������!

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator
    {
        public String translate()
        {
            return "� ���������� � �����������";
        }
    }
}