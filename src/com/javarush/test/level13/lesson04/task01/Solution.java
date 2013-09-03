package com.javarush.test.level13.lesson04.task01;

/* ���������� � �����������
1. ������� ����� EnglishTranslator, ������� ����������� �� Translator.
2. ����������� ��� ����������� ������.
3. �������, ��� ������ ���������� ����� getLanguage.
4. ��������� ������ �������� �� ����� "� ���������� � �����������".
5. ����� main ������ ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator
    {
        public abstract String getLanguage();

        public String translate()
        {
            return "� ���������� � " + getLanguage();
        }
    }

    static class EnglishTranslator extends Translator {
        @Override
        public String getLanguage()
        {
            return "�����������";
        }
    }

}