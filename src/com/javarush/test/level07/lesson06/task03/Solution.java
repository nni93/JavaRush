package com.javarush.test.level07.lesson06.task03;

/* 5 ������� � �������� �������
1. ������ ������ �����.
2. ������ � ���������� 5 ����� � ������ � ����.
3. ��������� �� � �������� �������.
4. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
        }
    }
}