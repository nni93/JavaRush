package com.javarush.test.level12.lesson12.home08;

/* ���������� � ������ Human
������ ��� ����� ������ ����������� � ������ Human, �� ����� �� �� ���� ����������� �������.
��������� ������ � ����� Human �����������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker
    {
        public void workLazy();
    }

    public static interface Businessman
    {
        public void workHard();
    }

    public static interface Secretary
    {
        public void workLazy();
    }

    public static interface Miner
    {
        public void workVeryHard();
    }

    public static class Human implements Businessman, Worker, Secretary
    {

        public void workHard()
        {
        }

        public void workLazy()
        {
        }
    }
}