package com.javarush.test.level05.lesson12.home05;

/* ������� � ���������� ����� � ������� �� �����
������� � ���������� ����� � ������� �� �����, ���� ������������ �� ����� ����� ������. ������� �� ����� ���������� �����.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int sum = 0;
        int i;
        String s;
        String keyWord = "�����";

        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);

        while(!(keyWord).equals(s = BR.readLine())) {
            i = Integer.parseInt(s);
            sum += i;
        }
        System.out.println(sum);
    }
}
