package com.javarush.test.level04.lesson06.task06;

/* � 18-�� ����������
������ � ���������� ��� � �������. ���� ������� ������ 20 ������� ������� �� 18-�� ����������.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
       String name;
        Integer age;
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        name = BR.readLine();
        age = Integer.valueOf(BR.readLine());
        if (age > 20) {
        System.out.println("� 18-�� ����������");
        } else {}
    }
}