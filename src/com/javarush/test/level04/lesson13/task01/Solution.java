package com.javarush.test.level04.lesson13.task01;

/* ������ �����
��������� ���� for ������� �� ����� ������ ����� �� 1 �� 100 ������������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i <= 100; i++){
        if (i % 2 == 0){
        System.out.print(i + " ");
        } 
      }
    }
}