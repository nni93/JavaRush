package com.javarush.test.level09.lesson06.task03;

/* ���������� ��� ������ � ���������
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
int[] m = new int[2];
m[8] = 5;

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

        int[] m = new int[2];
        m[8]= 5;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}