package com.javarush.test.level06.lesson11.home05;

/* ���� ����� ����? ��������...
1. � ������ Solution ������� public ����������� ����� Idea
2. � ������ Idea ������� ����� public String getDescription(), ������� ����� ���������� ����� �������� �����
3. � ������ Solution �������� ����������� ����� public void printIdea(Idea idea), ������� ����� ��������
�� ����� �������� ���� - ��� ��, ��� ���������� ����� getDescription

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
        Idea idea = new Idea();
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {

        public String getDescription() {
            return "Some text";
        }
    }

}