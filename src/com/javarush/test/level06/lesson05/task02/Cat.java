package com.javarush.test.level06.lesson05.task02;

/* ������ Cat � Dog � ����� finalize ��� �������
� ������ ������ Cat � Dog �������� ����� finalize, ������� ������� �� ����� ����� � ���, ��� �����-�� ������ ���������.

@author Nikolaieva Natalia
*/

public class Cat
{
    protected void finalize() {
        System.out.println("������ Cat ���������");
    }

}

class Dog
{
    protected void finalize() {
        System.out.println("������ Dog ���������");
    }

}