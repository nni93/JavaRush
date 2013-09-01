package com.javarush.test.level12.lesson06.task04;

/*  ласс Cow от Animal
”наследуй класс Cow от Animal.
–еализуй все недостающие методы в классе Cow.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Animal
    {
        public abstract String getName();
    }

    public static class Cow extends Animal
    {
        public String getName() {
            String s = "";
            return s;
        }
    }

}