package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ������ �������������
������ � ���������� ��� ����� m � n.
��������� ���� for ������� �� ����� ������������� �������� m �� n �� ��������.
������: m=2, n=4
8888
8888

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer m, n;
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        n = Integer.valueOf(BR.readLine());
        m = Integer.valueOf(BR.readLine());
        
        for (int i = 1; i <= n; i++){
        System.out.println();
        for (int j = 1; j <= m; j++){
        System.out.print("8");
        }
      }
    }
}