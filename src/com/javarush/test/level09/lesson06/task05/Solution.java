package com.javarush.test.level09.lesson06.task05;

import java.util.HashMap;

/* ���������� ��� ������ � ����������� Map
����������� ���������� (� ������� ��� �� �����), ������ ��� ���, ����������� ��� ���������� ����:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

    }
}