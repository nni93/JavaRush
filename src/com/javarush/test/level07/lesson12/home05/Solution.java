package com.javarush.test.level07.lesson12.home05;

/* ���
�������� ���������, ������� ���� �������� ������ � 30 �� 0, � � ����� ������� �� ����� ����� ����!�. ��������� ������ ��������� ����� 10 ��� � �������. ��� ���� ����� �������� � ��������� ��������, ������������ ��������:
Thread.sleep(100); //�������� �� ���� ������� �������.
������:
30
29
�
1
0
���!

@author Nikolaieva Natalia
*/

public class Solution {

    public static void main(String[] args)
    {
        for (int i=30;i>=0; i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("���!");
    }
}