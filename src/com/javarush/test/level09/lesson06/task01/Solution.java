package com.javarush.test.level09.lesson06.task01;

/* ���������� ��� ������ � �������
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
int a = 42 / 0;

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

         int a = 42/0;

        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}