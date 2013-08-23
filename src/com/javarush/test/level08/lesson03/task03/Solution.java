package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/* ��������� HashMap �� �����
���� ����� Cat � ����� ��� (name, String).
������� ��������� HashMap<String, Cat>.
�������� � ��������� 10 �����, � �������� ����� ������������ ��� ����.
������� ��������� �� �����, ������ ������� � ����� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"������", "�����", "�����", "�����", "�����", "������", "����", "�����", "����", "�����"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();

      for (int i = 0; i < cats.length; i++) {
          String s = cats[i];
          for (int j = 0; j < 10; j++) {
              Cat cat = new Cat(cats[i]);
              map.put(s, cat);
          }
      }
      return map;
    }


    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}