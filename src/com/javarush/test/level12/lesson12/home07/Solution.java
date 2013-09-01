package com.javarush.test.level12.lesson12.home07;

/* Fly, Run, Swim ��� ������� Duck, Penguin, Toad
���� ���������� Fly(������), Swim(�������), Run(������).
������ ��� ���������� ������� Duck(����), Penguin(�������), Toad(����)

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    public abstract class Duck implements Fly, Swim, Run
    {

    }

    public abstract class Penguin implements Swim, Run
    {

    }

    public abstract class Toad implements Swim
    {

    }
}