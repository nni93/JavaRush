package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ��� ����� �����
������ � ���������� ��� � ��������� ���� for 10 ��� �������: [*���* ����� ����.]
������ ������:
����� ����� ����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      String name;
      
      InputStreamReader ISR = new InputStreamReader(System.in);
      BufferedReader BR = new BufferedReader(ISR);
      
      name = BR.readLine();
      for (int i = 1; i <= 10; i++){
      System.out.println(name + " ����� ����.");
      }
    }
}