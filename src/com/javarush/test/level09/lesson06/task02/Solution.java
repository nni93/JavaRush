package com.javarush.test.level09.lesson06.task02;

/* ���������� ��� ������ �� ��������
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
String s = null;
String m = s.toLowerCase();

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {

        String s = null;
        String m = s.toLowerCase();

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

    }
}