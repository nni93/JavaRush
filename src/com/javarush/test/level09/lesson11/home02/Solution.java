package com.javarush.test.level09.lesson11.home02;

/* �������� ������ �� 10 �� 0
�������� � ����� �������� ������ �� 10 �� 0. ��� �������� �c���������� Thread.sleep(100);
�������� ����� sleep � try..catch.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 10; i >= 0; i--)
        {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                 e.getStackTrace();
            }
        }
    }
}