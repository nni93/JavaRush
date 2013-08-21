package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ��� �������
1. ����� � ���������� 20 �����, ������� �� � ������ � ����������� �� ��� ������ �������:
����� ������� �� 3 (x%3==0), ������� �� 2 (x%2==0) � ��� ���������.
�����, ������� ������� �� 3 � �� 2 ������������, �������� 6, �������� � ��� ������.
2. ����� printList ������ �������� �� ����� ��� �������� ������  � ����� ������.
3. ��������� ����� printList ������ ��� ��� ������ �� �����. ������� ���, ������� ��� x%3, ����� ���, ������� ��� x%2, ����� ���������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int listSize = 20;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listDiv3 = new ArrayList<Integer>();
        ArrayList<Integer> listDiv2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listSize; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if  ((list.get(i) % 3 == 0) & (list.get(i) % 2 == 0)) {
                listDiv3.add(list.get(i));
                listDiv2.add(list.get(i));
            }   else if (list.get(i) % 3 == 0) {
            	listDiv3.add(list.get(i));
            }   else if (list.get(i) % 2 == 0) {
            	listDiv2.add(list.get(i));
            }   else if ((list.get(i) % 3 != 0) & (list.get(i) % 2 != 0)) {
                other.add(list.get(i));
            }
        }
        printList(listDiv3);
        printList(listDiv2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}