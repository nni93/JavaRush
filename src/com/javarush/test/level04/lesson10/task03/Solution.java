package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* �������� �� ������ �����
������ � ���������� ������ � ����� N.
������� �� ����� ������ N ��� ��������� ���� while.
������ �����:
���
2
������ ������:
���
���

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s;
        int i;
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
    
        s = BR.readLine();
        i = Integer.valueOf(BR.readLine());

        while (i >= 1) {
        i--;
        System.out.println(s);
        }
    }
}