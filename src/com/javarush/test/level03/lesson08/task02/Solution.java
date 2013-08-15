package com.javarush.test.level03.lesson08.task02;

/* �������� ����� 5 ���
������ � ���������� ��� � ��� �����, ������� �������:
name1 �������� ������1� ����� ����� ������2� ���.
������: ���� �������� 3000 ����� 5 ���.

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
          String name;
          Integer money;
          Integer time;
          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
      try {     
          name = BR.readLine(); 
          System.out.print(name);
          
          System.out.print(" �������� ");
          money = Integer.valueOf(BR.readLine());
          System.out.print(money);
          
          System.out.print(" ����� ");
          time = Integer.valueOf(BR.readLine());
          System.out.print(time);
          
          System.out.print(" ���.");
          
          BR.close();
          ISR.close();
          
      } catch (IOException e){
              System.out.println("������ ����� " + e);        
    }
 }
}