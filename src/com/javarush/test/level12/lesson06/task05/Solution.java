package com.javarush.test.level12.lesson06.task05;

/* ������ Cat � Dog �� Pet
��������� ������ Cat � Dog �� Pet.
�������� ����������� ������. ������ Cat � Dog �� ������ ���� ������������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet
    {
      public String getName() {
          String s = "";
          return s;
      }

      public Pet getChild() {
          return new Cat();
      }
    }

    public static class Dog extends Pet
    {
        public String getName() {
            String s = "";
            return s;
        }

        public Pet getChild() {
            return new Dog();
        }
    }

}