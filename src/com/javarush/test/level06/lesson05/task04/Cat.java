package com.javarush.test.level06.lesson05.task04;

/* C������ �����
� ������������ ������ Cat [public Cat()] ����������� ������� ����� (����������� ���������� ����� �� ������ catCount) �� 1. � ������ finalize ��������� �� 1.

@author Nikolaieva Natalia
*/

public class Cat
{
    public static int catCount = 0;

    public Cat() {
        catCount += 1;
    }

    protected void finalize() {
        catCount -= catCount;
    }
    public static void main(String[] args) {
    }
}
