package com.javarush.test.level14.lesson04.task02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* ����
1. ��������� ������(���������) � �������, ���� ������������ �� ������ ������ ������(Enter).
2. ������ �������� ������������� ����� ����.
��� ������� ���������:
3. ������� ������ cat ������ Cat, ������� ����� ���� �� getCatByKey(String ��������).
4. ������� �� ����� cat.toString().

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    	BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter( new OutputStreamWriter(System.out));
    	String next;
        do
        {
            next = reader.readLine();
            Cat cat = CatFactory.getCatByKey(next);
            System.out.println(cat.toString()); 

            if (!next.equals(""))
            {
                writer.newLine();
            }
            else break;
        }
        while (!next.equals(""));
        reader.close();
        writer.close();
    }

    static class CatFactory
    {

        static Cat getCatByKey(String key)
        {
            Cat cat = null;
            if ("vaska".equals(key))
            {
                cat = new MaleCat("�������");
            } else if ("murka".equals(key))
            {
                cat = new FemaleCat("�������");
            } else if ("kiska".equals(key))
            {
                cat = new FemaleCat("��������");
            } else
            {
                cat = new Cat(key);
            }

            return cat;
        }
    }

    static class Cat
    {
        private String name;

        protected Cat(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }

        public String toString()
        {
            return "� ������� ��� " + getName();
        }
    }

    static class MaleCat extends Cat
    {
        MaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "� - �������� ����� �� ����� " + getName();
        }
    }

    static class FemaleCat extends Cat
    {
        FemaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "� - ����� ������� �� ����� " + getName();
        }
    }
}