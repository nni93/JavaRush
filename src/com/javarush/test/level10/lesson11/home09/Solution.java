package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* ���������� ����� � ������
������ � ���������� � ������ 20 ����. ����� ���������� ���������� ���������� ���� � ������. ��������� ����� ����������� � ���� ������� Map<String, Integer>, ��� ������ �������� � ���������� ������, � ������ � �����, ������� ��� ������ ������ ����������� � ������.
������� ���������� ������� �� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        Set<String> unique = new HashSet<String>(list);
        for (String key : unique) {
        	result.put(key, Collections.frequency(list, key));
    }
        return result;
    }
}