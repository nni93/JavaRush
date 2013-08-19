package com.javarush.test.level06.lesson08.task03;

/* ����� Util
����������� ����������� ����� double getDistance(x1, y1, x2, y2). �� ������ ��������� ���������� ����� �������.
��������� ����� double Math.sqrt(double a), ������� ��������� ���������� ������ ����������� ���������

@author Nikolaieva Natalia
*/

public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return d;
    }

    public static void main(String[] args) {
         Util.getDistance(2, 3, 4, 1);
    }
}