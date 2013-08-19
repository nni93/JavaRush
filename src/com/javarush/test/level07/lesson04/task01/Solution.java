package com.javarush.test.level07.lesson04.task01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/* ������������ ����� ������� �� 20 �����
1. � ������ initializeArray():
1.1. �������� ������ �� 20 �����
1.2. �������� � ������� 20 ����� � ��������� ��� ������
2. ����� max(int[] array) ������ �������� ������������ ����� �� ��������� �������

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        Arrays.sort(array);
        int max = max(array);
        System.out.println(max);   
    }    
    
    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
        	
        	array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}