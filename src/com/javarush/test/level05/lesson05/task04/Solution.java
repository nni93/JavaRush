package com.javarush.test.level05.lesson05.task04;

/* ������� ��� ������� ���� Cat
� ������ main ������� ��� ������� ���� Cat � ��������� �� �������.
������������ ����� Cat �� ������ ������. ����� Cat ��������� �� ����.

@author Nikolaieva Natalia
*/

public class Solution {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Vaska", 2, 3, 4);
       Cat cat2 = new Cat("Pushok", 3, 2, 1);
       Cat cat3 = new Cat("Barsik", 2, 2, 3);
       
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}