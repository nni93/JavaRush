package com.javarush.test.level03.lesson08.task03;

/* ���������� �������� ��������
������ � ���������� ��� � ������� �������:
name ������������ $5,000. ��-��-��!
������: ����� ������������ $5,000. ��-��-��!

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.NumberFormat.*;
import java.util.Locale;

public class Solution
{
 public static void main(String[] args) throws Exception
    {
          String name;

          InputStreamReader ISR = new InputStreamReader(System.in);
          BufferedReader BR = new BufferedReader(ISR);
      try {     
          name = BR.readLine(); 
          System.out.print(name);
          
          System.out.print(" ������������ $5,000"); 

          System.out.print(". ��-��-��!");
           
          BR.close();
          ISR.close();
          
      } catch (IOException e){
              System.out.println("������ ����� " + e);        
    }
 }
}