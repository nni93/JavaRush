package com.javarush.test.level09.lesson11.home01;

/* ������� �� ����
������ ����� public static void divisionByZero, � ������� ������ ����� ����� �� ���� � ������ �� ����� ��������� �������.
������ ����� ������ divisionByZero � try..catch. ������ ����-����� ���������� ��������� ����� exception.printStackTrace()

@author Nikolaieva Natalia
*/

public class Solution {

    public static void main(String[] args) {

        try {
        divisionByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero() {
        int div = 1/0;
    }
}