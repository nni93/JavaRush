package com.javarush.test.level03.lesson08.task05;

/* ������ ������
������ � ���������� ��� �����, ������� �� ����� �������:
name1 + name2 + name3 = ������ ������, ��-��!
������: ���� + ��� + �������� = ������ ������, ��-��!

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String name1, name2, name3;

          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
          try {     
          name1 = BR.readLine(); 
          name2 = BR.readLine();
          name3 = BR.readLine();
          System.out.print(name1 + " + " + name2 + " + " + name3 + " = ������ ������, ��-��!");
          BR.close();
          ISR.close();
          } catch (IOException e){
              System.out.println("������ ����� " + e);        
    }
    }
}