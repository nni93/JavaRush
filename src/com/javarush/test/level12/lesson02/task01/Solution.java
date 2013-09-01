package com.javarush.test.level12.lesson02.task01;

/* я не корова, я - кит.
ѕереопределить метод getName в классе Whale( ит), чтобы программа выдавала:
я не корова, я - кит.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow
    {
        public String getName()
        {
            return "я - корова";
        }
    }

    public static class Whale extends Cow
    {
        @Override
        public String getName() {
            return "я не корова, я - кит.";
        }
    }
}