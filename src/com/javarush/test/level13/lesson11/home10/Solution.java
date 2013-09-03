package com.javarush.test.level13.lesson11.home10;

import java.awt.*;

/* ���������� ���������
1. ������� ����� BigFox ���, ����� ��������� ���������������.
2. ����� main ������ ������.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
       Fox bigFox = new BigFox();
       System.out.println(bigFox.getName());
       System.out.println(bigFox.getColor());
    }

    public interface Animal
    {
        Color getColor();
    }

      public abstract static class Fox implements Animal
      {
          public String getName() {
              return "Fox";
          }
      }

    public static class BigFox extends Fox
    {
        @Override
        public Color getColor()
        {
            return null;
        }

        @Override
        public String getName()
        {
            return super.getName();
        }
    }

}