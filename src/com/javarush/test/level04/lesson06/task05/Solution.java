package com.javarush.test.level04.lesson06.task05;

/* 18+
������ � ���������� ��� � �������. ���� ������� ������ 18 ������� ������� ��������� ���.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String name;
        Integer age;
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        name = BR.readLine();
        age = Integer.valueOf(BR.readLine());
        if (age < 18) {
        System.out.println("�������� ���");
        } else {}
    }
}