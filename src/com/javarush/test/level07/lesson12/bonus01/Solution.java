package com.javarush.test.level07.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* ����� ��������� ���������, ����� ��������������� � ��������
������:  ��������� ������ � ���������� ������ ��� ����� � ������� �� �� �����. ������:
Cat name is Barsik age is 6, weight is 5, tail = 22
Cat name is Murka age is 8, weight is 7, tail = 20

@author Nikolaieva Natalia
*/

public class Solution
{
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String name = reader.readLine();
            if (name.isEmpty()) break;
            
            String ageString = reader.readLine();
            if (ageString.isEmpty()) break;
            int age = Integer.parseInt(ageString);
            
            String weightString = reader.readLine();
            if (weightString.isEmpty()) break;
            int weight = Integer.parseInt(weightString);
            
            String tailLengthString = reader.readLine();
            if (tailLengthString.isEmpty()) break;
            int tailLength = Integer.parseInt(tailLengthString);

            Cat cat = new Cat(name, age, weight, tailLength);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++)
        {
            System.out.println(CATS.get(i).toString());
        }
    }

    public static class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}