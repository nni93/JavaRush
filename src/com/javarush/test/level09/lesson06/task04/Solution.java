package com.javarush.test.level09.lesson06.task04;

import java.util.ArrayList;

/* ���������� ��� ������ � ����������� List
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}